package flgdx.events;

import java.lang.reflect.Method;

class EventListenerPair
{
    protected Object _listener;
    protected Method _method;

    public EventListenerPair(Object listener, String method)
    {
        try
        {
            _listener = listener;
            for (Method m : listener.getClass().getMethods())
            {
                if (m.getName().equals(method))
                {
                    _method = m;
                    break;
                }
            }

            if (_method == null)
            {
                throw new Exception("Could not find method named " + method + " in class " + listener.getClass().getName());
            }
        }
        catch(Exception ex)
        {
            // Write error
        }
    }

    public boolean call(Event event)
    {
        try
        {
            _method.invoke(_listener, event);
            return true;
        }
        catch(Exception ex)
        {
            // TODO: Dispose of the listener if it's null?
            return false;
        }
    }

    public void dispose()
    {
        _listener = null;
        _method = null;
    }
}
