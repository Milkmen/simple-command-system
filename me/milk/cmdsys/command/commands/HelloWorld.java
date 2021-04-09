package me.milk.cmdsys.command.commands;

import me.milk.cmdsys.command.Command;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class HelloWorld implements Command {

	@Override
	public void onExecute(String[] args) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Hello, World!"));
		
	}

}
