package userInterface;

import java.awt.*;
import javax.swing.*;

import fanLogic.FanController;
import hardwareAbstraction.FanMotorSimulator;
import persistenceManager.FanSpeedSave;

/**
 *
 */
public final class GUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private final transient FanMotorSimulator motor;
    private final transient FanController controller;

    private final FanControlPanel fanControlPanel;
    private final OperatingModePanel operatingModePanel;

    public GUI() {
        super("Ventilatorsteuerung");

        // --- Schichten aufbauen ---
        this.motor = new FanMotorSimulator();
        FanSpeedSave persistence = FanSpeedSave.getInstance();
        this.controller = new FanController(motor, persistence);

        // --- Oberflaeche ---
        PowerButton powerButton = new PowerButton(controller);
        this.operatingModePanel = new OperatingModePanel(controller);
        this.fanControlPanel = new FanControlPanel(controller);

        JPanel top = new JPanel(new FlowLayout());
        top.add(powerButton);

        setLayout(new BorderLayout(10, 10));
        add(top, BorderLayout.NORTH);
        add(operatingModePanel, BorderLayout.CENTER);
        add(fanControlPanel, BorderLayout.SOUTH);

        Timer tick = new Timer(motor.getTickMs, e -> {
            motor.simulateMotor();
            fanControlPanel.refreshDisplay();
            operatingModePanel.refreshDisplay();
        });
        tick.start();

        setMinimumSize(new Dimension(360, 380));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI().setVisible(true));
    }
}
