package fanLogic;

import hardwareAbstraction.FanMotorSimulator;
import persistenceManager.FanSpeedSave;

/**
 * Coordinates the behavior of the fan system.
 * It connects the incoming user interface requests with the underlying
 * hardware simulation and persistent storage management.
 */
public class FanController {
    private final FanMotorSimulator motor;
    private final FanSpeedSave persistence;

    private SpeedLevel currentLevel;
    private static final OperatingMode currentMode = OperatingMode.MANUAL;

    /**
     * Initializes the controller and restores the last saved speed level.
     * @param motor       The simulator instance for the fan motor.
     * @param persistence The storage manager to load/save states.
     */
    public FanController(FanMotorSimulator motor, FanSpeedSave persistence) {
        this.motor = motor;
        this.persistence = persistence;
        this.currentLevel = SpeedLevel.fromLevel(persistence.loadLastSpeed());
    }

    /**
     * Raises the speed level by one.
     */
    public void raiseSpeed() {
        currentLevel = currentLevel.next();
        applyLevel();
    }

    /**
     * Lowers the speed level by one.
     */
    public void lowerSpeed() {
        currentLevel = currentLevel.previous();
        applyLevel();
    }

    private void applyLevel() {
        motor.setMotorSpeed(levelToRpm(currentLevel));
        persistence.saveLastSpeed(currentLevel.getLevel());
    }

    private int levelToRpm(SpeedLevel level) {
        return (int) Math.round(level.getFactor() * motor.getMaxRpm());
    }

    /**
     * Gets the currently set speed level.
     * @return The current SpeedLevel enum value.
     */
    public SpeedLevel getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Gets the current operating mode of the fan.
     * @return The current OperatingMode enum value.
     */
    public OperatingMode getOperatingMode() {
        return currentMode;
    }

    /**
     * Toggles the power state of the fan motor.
     * If turned on, the motor speed is automatically set to the current level.
     */
    public void togglePower() {
        if(motor.isPowerOn()) {
            motor.turnOff();
        } else {
            motor.turnOn();
            motor.setMotorSpeed(levelToRpm(currentLevel));
        }
    }

    /**
     * Checks if the fan motor is currently running.
     * @return {@code true} if the motor is powered on, {@code false} otherwise.
     */
    public boolean isOn() {
        return motor.isPowerOn();
    }

}