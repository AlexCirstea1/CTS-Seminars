package observer;

public class AutoSaveModule implements ConnectionStatusInterface{
    @Override
    public void connectionUpdate(boolean isConnected) {
        if(!isConnected) {
            System.out.println("Saving game data...");
        }
    }
}
