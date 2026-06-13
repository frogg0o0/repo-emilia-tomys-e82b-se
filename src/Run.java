import fanLogic.FanController;
import hardwareAbstraction.FanMotorSimulator;
import persistenceManager.FanSpeedSave;
import userInterface.GUI;

import javax.swing.*;

/**
 * The main entry point of the application.
 * This class is responsible for bootstrapping the system by instantiating
 * the components from all layers and starting the core simulation timer.
 */
public final class Run {

    /**
     * Main method that launches the application.
     * Ensures that the GUI creation runs safely on the Swing Event Dispatch Thread.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Run::start);
    }

    private static void start() {
        FanMotorSimulator motor = new FanMotorSimulator();
        FanSpeedSave persistence = FanSpeedSave.getInstance();

        FanController controller = new FanController(motor, persistence);

        GUI gui = new GUI(controller);
        gui.setVisible(true);

        Timer tick = new Timer(motor.getTickMs(), e -> {
            motor.simulateMotor();
            gui.refreshDisplays();
        });
        tick.start();
    }
}