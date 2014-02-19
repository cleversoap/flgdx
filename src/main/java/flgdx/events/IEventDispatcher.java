package flgdx.events;

public interface IEventDispatcher
{
    void addEventListener(String type, Object listener, String method);

    boolean dispatchEvent(Event event);

    boolean hasEventListener(String type);

    void removeEventListener(String type, Object listener, String method);

    boolean willTrigger(String type);
}
