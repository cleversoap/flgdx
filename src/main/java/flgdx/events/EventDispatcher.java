package flgdx.events;

import java.util.Hashtable;
import java.util.ArrayList;

public class EventDispatcher implements IEventDispatcher
{
    // TODO:    Dictionary that is keyed by the event type
    //          but that holds a threadsafe list of event
    //          handlers and the method (some sort of EventListenerPair
    //          class may be needed)
    protected Hashtable<String, ArrayList<EventListenerPair> > _listeners;

    public EventDispatcher()
    {
        _listeners = new Hashtable<String, ArrayList<EventListenerPair> >();
    }

    public void addEventListener(String type, Object listener, String method)
    {
        // If there is no list of listeners for this key
        // then create one.
        if (!_listeners.containsKey(type))
        {
            _listeners.put(type, new ArrayList<EventListenerPair>());
        }

        // Now add to the entry
        _listeners.get(type).add(new EventListenerPair(listener, method));
    }

    public boolean dispatchEvent(Event event)
    {
        boolean result = true;

        // TODO: Fastest way to iterate this list
        if (this.hasEventListener(event.type))
        {
            for (EventListenerPair listener : _listeners.get(event.type))
            {
                result = listener.call(event);

                if (!result)
                {
                    break;
                }
            }
        }

        return result;
    }

    public boolean hasEventListener(String type)
    {
        return _listeners.containsKey(type);
    }

    public void removeEventListener(String type, Object listener, String method)
    {

    }

    // TODO: This will need to be a part of an event chain if implemented.
    public boolean willTrigger(String type)
    {
        return this.hasEventListener(type);
    }
}
