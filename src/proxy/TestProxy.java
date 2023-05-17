package proxy;

public class TestProxy {
    public static void main(String[] args) {
        AbstractChatServerClient chatServer = new ChatServerClient();
        chatServer.sendMessage("John","John is smoking and drinking alcohol");
        chatServer.sendMessageToAll("Run for your life");

        chatServer = new ChatServerFilterProxy(chatServer);
        chatServer.sendMessage("John","John is smoking and drinking alcohol");
        chatServer.sendMessageToAll("Run for your life");
    }
}
