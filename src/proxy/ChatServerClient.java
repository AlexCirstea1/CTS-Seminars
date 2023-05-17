package proxy;

public class ChatServerClient extends AbstractChatServerClient{
    @Override
    public void sendMessage(String username, String msg) {
        System.out.println("Sending message " + msg + " to user " + username);
    }

    @Override
    public void sendMessageToAll(String msg) {
        System.out.println("Send all this message: " + msg);
    }

    @Override
    public void getMessageForUser(String username) {
        System.out.println("Getting messages for " + username);
    }
}
