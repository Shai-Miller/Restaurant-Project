package MicroServices;

public class MessageBusImpl {
    private static MessageBusImpl ourInstance = new MessageBusImpl();

    public static MessageBusImpl getInstance() {
        return ourInstance;
    }

    private MessageBusImpl() {

    }
}
