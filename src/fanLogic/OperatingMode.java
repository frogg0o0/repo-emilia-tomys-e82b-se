package fanLogic;

/**
 *  Enum of the different operating modes supported by the fan.
 */
public enum OperatingMode {
    /** Manual mode where the user explicitly controls the speed levels.*/
    MANUAL("Manual");

    private final String displayName;

    OperatingMode(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the displayable name of the operating state.
     * @return The user-friendly name of the mode.
     */
    public String getDisplayName() {
        return displayName;
    }
}