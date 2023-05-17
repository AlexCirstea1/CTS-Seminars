package proxy;

public abstract class AbstractChatServerClient {
    String serverIP;
    public abstract void sendMessage(String username, String msg);
    public abstract void sendMessageToAll(String msg);
    public abstract void getMessageForUser(String username);
}
