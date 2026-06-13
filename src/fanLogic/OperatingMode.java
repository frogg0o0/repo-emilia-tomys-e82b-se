package fanLogic;

/**
 *  Enum of the different operating modes supported by the fan.
 */
public enum OperatingMode {

    MANUAL("Manual"),
    AUTO("Auto"),
    NIGHT("Night");

    private final String displayName;

    OperatingMode(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Name that shows up in the user interface.
     *
     * @return name of the operating mode
     */
    public String getDisplayName() {
        return displayName;
    }
}