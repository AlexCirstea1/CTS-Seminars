package observer;

import java.util.ArrayList;
import java.util.Random;

public class GameServerConnection {
    ArrayList<ConnectionStatusInterface> connectionHandlers =
            new ArrayList<>();

    public void registerConnectionHandler(ConnectionStatusInterface monitor) {
        this.connectionHandlers.add(monitor);
    }
    public void removeConnectionHandler(ConnectionStatusInterface monitor) {
        this.connectionHandlers.remove(monitor);
    }
    public void connectionStatusChanged() {
        Random random = new Random();
        boolean isConnected = random.nextBoolean();

        for(ConnectionStatusInterface monitor: connectionHandlers)
            monitor.connectionUpdate(isConnected);
    }
}
