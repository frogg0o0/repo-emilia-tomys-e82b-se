package userInterface;

import java.awt.*;
import javax.swing.*;

import fanLogic.FanController;

/**
 * Main window of the fan control application.
 * Establishes the visual layout and connects the individual UI panels
 * to the central controller.
 */
public final class GUI extends JFrame {
    private final FanControlPanel fanControlPanel;
    private final OperatingModePanel operatingModePanel;
    private final PowerButton powerButton;
    private final PowerButtonUIHandler powerButtonUIHandler;

    /**
     * Constructs the main GUI window and initializes all sub-panels.
     * @param controller The central business logic controller of the fan.
     */
    public GUI(FanController controller) {
        super("Ventilatorsteuerung");

        this.powerButton = new PowerButton();
        this.powerButtonUIHandler = new PowerButtonUIHandler(powerButton, controller, this);

        this.operatingModePanel = new OperatingModePanel(controller);
        this.fanControlPanel = new FanControlPanel(controller);

        JPanel top = new JPanel(new FlowLayout());
        top.add(powerButton);

        JPanel modeWrap = new JPanel(new GridBagLayout());
        modeWrap.add(operatingModePanel);

        setLayout(new BorderLayout(10, 10));
        add(top, BorderLayout.NORTH);
        add(modeWrap, BorderLayout.CENTER);
        add(fanControlPanel, BorderLayout.SOUTH);

        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Refreshes the fan control and operating mode displays to match the current state.
     */
    public void refreshDisplays() {
        fanControlPanel.refreshDisplay();
        operatingModePanel.refreshDisplay();
    }
}