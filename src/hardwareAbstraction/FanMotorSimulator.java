package hardwareAbstraction;

/**
 * Simulates the motor of the fan.
 * This class calculates the continuous speed changes (acceleration and deceleration)
 * of the fan based on a predefined ramp factor. It implements the {@link FanSpeedSensor}
 * interface to allow reading the current rotational speed.
 */
public class FanMotorSimulator implements FanSpeedSensor {
    private static final int MAX_RPM = 1400;
    private static final int TICK_MS = 50;
    private static final double RAMP_FACTOR = 0.15;

    private int currentRpm;
    private int targetRpm;
    private boolean powerOn;

    /**
     * Constructs a new FanMotorSimulator with default initial values.
     * The motor starts powered off with both current and target RPM set to 0.
     */
    public FanMotorSimulator() {
        this.currentRpm = 0;
        this.targetRpm = 0;
        this.powerOn = false;
    }

    /**
     * Simulates one time tick of the motor behavior.
     * Calculates acceleration or deceleration toward the target RPM
     * depending on the power state and the ramp factor.
     */
    public void simulateMotor() {
        int goal = powerOn ? targetRpm : 0;
        int delta = (int) Math.round((goal - currentRpm) * RAMP_FACTOR);
        if (delta == 0 && currentRpm != goal) {
            delta = goal > currentRpm ? 1 : -1;
        }
        currentRpm += delta;
        if (currentRpm < 0) {
            currentRpm = 0;
        }
    }

    @Override
    public int readFanSpeed() {
        return currentRpm;
    }

    /**
     * Sets the targetRpm of the motor.
     * @param targetRpm The chosen target rpm. Will be clamped between 0 and MAX_RPM.
     */
    public void setMotorSpeed(int targetRpm) {
        this.targetRpm = Math.clamp(targetRpm, 0, MAX_RPM);
    }

    /**
     * Turns the motor on.
     */
    public void turnOn() {
        this.powerOn = true;
    }

    /**
     * Turns the motor off and resets the target speed.
     */
    public void turnOff() {
        this.powerOn = false;
        this.targetRpm = 0;
    }

    /**
     * Tells whether the motor is turned on or off.
     * @return {@code true} if the motor is powered on, {@code false} otherwise.
     */
    public boolean isPowerOn() {
        return powerOn;
    }

    /**
     * Gets the simulation tick interval.
     * * @return The tick interval in milliseconds.
     */
    public int getTickMs() {
        return TICK_MS;
    }

    /**
     * Gets the maximum rotational speed supported by the motor.
     * * @return The maximum speed in revolutions per minute [rpm].
     */
    public int getMaxRpm() {
        return MAX_RPM;
    }
}
