package flgdx.events;

public class EventDispatcher implements IEventDispatcher
{
    public EventDispatcher()
    {
    }

    public void addEventListener(String type, Object listener, String method)
    {

    }

    public boolean dispatchEvent(Event event)
    {
        return true;
    }

    public boolean hasEventListener(String type)
    {
        return false;
    }

    public void removeEventListener(String type, Object listener, String method)
    {

    }

    public boolean willTrigger(String type)
    {
        return false;
    }
}
