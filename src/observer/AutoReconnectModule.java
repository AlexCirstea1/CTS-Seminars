package observer;

public class AutoReconnectModule implements ConnectionStatusInterface{
    @Override
    public void connectionUpdate(boolean isConnected) {
        if(!isConnected) {
            System.out.println("Reconnecting in ... 10s");
        }
    }
}
