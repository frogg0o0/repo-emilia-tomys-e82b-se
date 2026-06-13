package fanLogic;

/**
 * The five adjustable speed levels.
 */
public enum SpeedLevel {
    /** Lowest speed level.*/
    LEVEL_1(1, 0.1),
    /** Second-lowest speed level.*/
    LEVEL_2(2, 0.25),
    /** Medium speed level.*/
    LEVEL_3(3, 0.5),
    /** Second-highest speed level.*/
    LEVEL_4(4, 0.75),
    /** Highest speed level.*/
    LEVEL_5(5, 1.0);

    private final int level;
    private final double factor;

    SpeedLevel(int level, double factor) {
        this.level = level;
        this.factor = factor;
    }

    /**
     * Gets the current speed level.
     * @return The speed level (1-5).
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets the fraction of the maximum speed.
     * @return The factor.
     */
    public double getFactor() {
        return factor;
    }

    /**
     * Gets the next higher speed level.
     * @return The next higher speed level or LEVEL_5 if already at maximum.
     */
    public SpeedLevel next() {
        if (this.level == 5) {
            return LEVEL_5;
        } else {
            return fromLevel(level + 1);
        }
    }

    /**
     * Gets the next lower speed level.
     * @return The previous level or LEVEL_1 if already at minimum.
     */
    public SpeedLevel previous() {
        if (this.level == 1) {
            return LEVEL_1;
        } else  {
            return fromLevel(this.level - 1);
        }
    }

    /**
     * Finds the speed level by its integer value.
     * @param level The level number (1-5).
     * @return The matching SpeedLevel, or LEVEL_3 as a fallback.
     */
    public static SpeedLevel fromLevel(int level) {
        for (SpeedLevel l : values()) {
            if (l.level == level) {
                return l;
            }
        }
        return LEVEL_3;
    }
}