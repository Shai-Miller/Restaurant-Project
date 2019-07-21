package MicroServices;

/**
 * Maker interface extending {@link Message}. A micro-service that sends an Event,
 * expects to receive a result of type {@code <T>} when the receiver handled the request.
 *
 */
public interface Event<T> extends Message {
}
