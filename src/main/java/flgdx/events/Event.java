package flgdx.events;

public class Event
{
    public static final String ACTIVATE                     = "activate";
    public static final String ADDED                        = "added";
    public static final String ADDED_TO_STAGE               = "addedToStage";
    public static final String CANCEL                       = "cancel";
    public static final String CHANGE                       = "change";
    public static final String CHANNEL_MESSAGE              = "channelMessage";
    public static final String CHANNEL_STATE                = "channelState";
    public static final String CLEAR                        = "clear";
    public static final String CLOSE                        = "close";
    public static final String CLOSING                      = "closing";
    public static final String COMPLETE                     = "complete";
    public static final String CONNECT                      = "connect";
    public static final String CONTEXT3D_CREATE             = "context3DCreate";
    public static final String COPY                         = "copy";
    public static final String CUT                          = "cut";
    public static final String DEACTIVATE                   = "deactivate";
    public static final String DISPLAYING                   = "displaying";
    public static final String ENTER_FRAME                  = "enterFrame";
    public static final String EXIT_FRAME                   = "exitFrame";
    public static final String EXITING                      = "exiting";
    public static final String FRAME_CONSTRUCTED            = "frameConstructed";
    public static final String FRAME_LABEL                  = "frameLabel";
    public static final String FULLSCREEN                   = "fullScreen";
    public static final String HTML_BOUNDS_CHANGE           = "htmlBoundsChange";
    public static final String HTML_DOM_INITIALIZE          = "htmlDOMInitialize";
    public static final String HTML_RENDER                  = "htmlRender";
    public static final String ID3                          = "id3";
    public static final String INIT                         = "init";
    public static final String LOCATION_CHANGE              = "locationChange";
    public static final String MOUSE_LEAVE                  = "mouseLeave";
    public static final String NETWORK_CHANGE               = "networkChange";
    public static final String OPEN                         = "open";
    public static final String PASTE                        = "paste";
    public static final String PREPARING                    = "preparing";
    public static final String REMOVED                      = "removed";
    public static final String REMOVED_FROM_STAGE           = "removedFromStage";
    public static final String RENDER                       = "render";
    public static final String RESIZE                       = "resize";
    public static final String SCROLL                       = "scroll";
    public static final String SELECT                       = "select";
    public static final String SELECT_ALL                   = "selectAll";
    public static final String SOUND_COMPLETE               = "soundComplete";
    public static final String STANDARD_ERROR_CLOSE         = "standardErrorClose";
    public static final String STANDARD_INPUT_CLOSE         = "standardInputClose";
    public static final String STANDARD_OUTPUT_CLOSE        = "standardOutputClose";
    public static final String SUSPEND                      = "suspend";
    public static final String TAB_CHILDREN_CHANGE          = "tabChildrenChange";
    public static final String TAB_ENABLED_CHANGE           = "tabEnabledChange";
    public static final String TAB_INDEX_CHANGE             = "tabIndexChange";
    public static final String TEXT_INTERACTION_MODE_CHANGE = "textInteractionModeChange";
    public static final String TEXTURE_READY                = "textureReady";
    public static final String UNLOAD                       = "unload";
    public static final String USER_IDLE                    = "userIdle";
    public static final String USER_PRESENT                 = "userPresent";
    public static final String VIDEO_FRAME                  = "videoFrame";
    public static final String WORKER_STATE                 = "workerState";

    protected String type;

    public Event(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}
