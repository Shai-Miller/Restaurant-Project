package MicroServices;

/**
 * Message is the way that micro-services communicate.
 * it is a data-Object that one micro-service can pass to another.
 * No methods for Message, but every class that want to send a message (using {@link MessageBus})
 * must implements it.
 */

public interface Message {
}
