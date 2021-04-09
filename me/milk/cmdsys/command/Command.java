package me.milk.cmdsys.command;

public interface Command {
	
	/**
	 * The method that gets executed when the command is called
	 * @param args the arguments for the command
	 */
	void onExecute(String[] args);
}
