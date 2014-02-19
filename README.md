# FLGDX

Flash is dying, make no mistake.

## What's Different?

While I have tried to keep things as similar as possible to AS3 there are some
minor adjustments that need to be made as the languages are not identical or
have some limitations.

### Events

When adding an event listener you must now also pass the instance of the listening
class as Java does not have function pointers. Because of this limitation you
must now also pass the name of the method as a String.

So now instead of ```dispatcher.addEventListener(Event.COMPLETE, onCompleteHandler)```
you will instead use ```dispatcher.addEventListener(Event.COMPLETE, this, "onCompleteHandler")```

Not all the events in **flgdx.events.Event** are implemented or used so listening
for them may not work. I have simply included them for the sake of posterity at this
point and they may be removed.
