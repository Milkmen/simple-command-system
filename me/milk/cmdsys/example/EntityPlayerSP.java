package me.milk.cmdsys.example;

public class EntityPlayerSP {
	/*
	 * this is how the sendChatMessage function should look like
	 */
	public void sendChatMessage(String message)
    {
        if(!message.startsWith(Client.cmdmgr.prefix)) 
        	this.sendQueue.addToSendQueue(new C01PacketChatMessage(message));
        else
        	Client.cmdmgr.onCommand(message);
    }
}
