package me.milk.cmdsys.example;

import me.milk.cmdsys.command.CommandManager;

public class Client {
	
	public static CommandManager cmdmgr; // Should be in your Clients Main class
	
	public static void startup() {
		cmdmgr = new CommandManager(); // Initialize the Command-Manager in your startup method
	}
}
