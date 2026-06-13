import fanLogic.FanController;
import hardwareAbstraction.FanMotorSimulator;
import persistenceManager.FanSpeedSave;
import userInterface.GUI;

import javax.swing.*;

public final class Run {

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