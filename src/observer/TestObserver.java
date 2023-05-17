package observer;

public class TestObserver {
    public static void main(String[] args) {
        GameServerConnection server = new GameServerConnection();

        AutoReconnectModule autoReconnect = new AutoReconnectModule();
        AutoSaveModule autoSave = new AutoSaveModule();
        UserNotificationModule uiNotifications = new UserNotificationModule();

        server.connectionStatusChanged();

        server.registerConnectionHandler(autoReconnect);
        server.registerConnectionHandler(autoSave);
        server.registerConnectionHandler(uiNotifications);

        server.connectionStatusChanged();

        server.removeConnectionHandler(autoSave);
        server.connectionStatusChanged();

        server.registerConnectionHandler(new ConnectionStatusInterface() {
            @Override
            public void connectionUpdate(boolean isConnected) {
                System.out.println("Extra job!");
            }
        });

        server.connectionStatusChanged();
    }
}
