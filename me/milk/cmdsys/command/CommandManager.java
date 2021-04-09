package me.milk.cmdsys.command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import me.milk.cmdsys.command.commands.HelloWorld;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class CommandManager {
	public String prefix = ".";
	
	Map<String, Command> commands = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
	/**
	 * The method used to initialize the Command-Manager
	 */
	public CommandManager() { /* Should be called from your Client startup function */
		add("helloworld", new HelloWorld());
	}
	
	/**
	 * Is used in order to make it easier to add commands
	 * @param s the actual chat command
	 * @param c the commands class including functionality
	 */
	public void add(String s, Command c) {
		commands.put(s, c);
	}
	
	/**
	 * The method that should be executed when the player sends a command
	 * @param text the chat message that has been send
	 */
	public void onCommand(String text) {		
		text = text.substring(prefix.length()); // Gets rid of the prefix
		
		String[] args = text.split(" "); // Splits the chat message into its arguments
		
		if(commands.containsKey(args[0])) { // Checks if the command exists
			String[] cmdArgs = Arrays.copyOfRange(args, 1, args.length); // Gets rid of the command name
			commands.get(args[0]).onExecute(cmdArgs); // Calls the onExecute method of the Command
		} else {
			// TODO: Replace this with your addChatMessage function if possible
			Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Command not Found.")); // Sends a message if the command has not been found
		}
	}
}
