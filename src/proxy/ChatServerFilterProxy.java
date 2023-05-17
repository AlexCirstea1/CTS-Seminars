package proxy;

import java.util.ArrayList;

public class ChatServerFilterProxy extends AbstractChatServerClient {
    AbstractChatServerClient chatServer;
    ArrayList<String> forbiddenWordsList = new ArrayList<>();

    public ChatServerFilterProxy(AbstractChatServerClient chatServer) {
        this.chatServer = chatServer;
        this.forbiddenWordsList.add("smoke");
        this.forbiddenWordsList.add("alcohol");
        this.forbiddenWordsList.add("hate");
    }

    @Override
    public void sendMessage(String username, String msg) {
        for (String word: this.forbiddenWordsList) {
            if(msg.toLowerCase().contains(word))
                return;
        }
        this.chatServer.sendMessage(username, msg);
    }

    @Override
    public void sendMessageToAll(String msg) {
        for (String word: this.forbiddenWordsList) {
            if(msg.toLowerCase().contains(word))
                return;
        }
        this.chatServer.sendMessageToAll(msg);
    }

    @Override
    public void getMessageForUser(String username) {
        this.chatServer.getMessageForUser(username);
    }
}
