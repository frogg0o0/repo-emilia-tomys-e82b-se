package hardwareAbstraction;

/**
 * Sensor that measures the current speed of the fan.
 */
public interface FanSpeedSensor {
    /**
     * Reads the current fan speed.
     * @return The speed of the fan in rotations per minute [rpm].
     */
    public int readFanSpeed();
}
