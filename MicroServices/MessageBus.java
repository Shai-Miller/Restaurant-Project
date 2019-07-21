package MicroServices;
import java.util.concurrent.FutureTask;

/**
 * A micro-service that wants to communicate with another micro-service sending a message.
 * This message is going through the MessageBus.
 * TODO: The implementation must be thread-safe singleton, for getting few messages at a time.
 *
 */

public interface MessageBus {
    /**
     * Subscribe {@code ms} to recive {@link Event}s of type {@code type}.
     *
     * @param <T> - the type of result expected once the Event is done.
     * @param type - the Event to Subscribe for
     * @param ms - the subscribing micro-service
     */
    <T> void subscribeEvent (Class <? extends Event<T>> type, MicroService ms);


    /**
     * This function is use to complete the handeling of a micro service with {@param event} request,
     * by telling to the {@link MessageBus}, and that the result is {@param res}.
     * when this method is called, the message bus will resolve the {@link FutureTask} object
     * that is "connected" to {@param event};
     */
    <T> void complete(Event<T> event, T res);

    /**
     * This method will add the {@link Event} {@code event} to the message queue of the micro-service
     * that suppose to handle it. TODO: methode should be non-blocking!
     *
     * @param event - the event to add to the queue.
     * @param <T> - the type of result and it's future.
     * @return - future object that can be used once the processing is complete.
     */
    <T> FutureTask<T> sendEvent (Event<T> event);

    /**
     * Register a micro-service to the message bus by giving it a queue for messages.
     *
     * @param ms - the micro-service to register.
     */
    void register (MicroService ms);

    /**
     * This method will use to exit "gracefully" - finishing all event in the queue
     * and removing the micro service {@param ms} (his queue) from the message-bus.
     */
    void unregister (MicroService ms);
}
