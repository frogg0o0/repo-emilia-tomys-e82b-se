package userInterface;

import java.awt.*;
import javax.swing.*;

import fanLogic.FanController;

class OperatingModePanel extends JPanel {
    private final transient FanController controller;
    private final JLabel modeLabel;

    OperatingModePanel(FanController controller) {
        this.controller = controller;
        this.modeLabel = new JLabel("", SwingConstants.CENTER);

        modeLabel.setFont(modeLabel.getFont().deriveFont(Font.BOLD, 75f));
        modeLabel.setForeground(Color.BLACK);
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(3, 30, 3, 30)));
        setLayout(new GridBagLayout());
        add(modeLabel);
        refreshDisplay();
        setPreferredSize(new Dimension(600, 150));
    }

    /**
     * Updates the text label based on whether the fan is running and its mode.
     */
    public void refreshDisplay() {
        if (controller.isOn()) {
            modeLabel.setText(controller.getOperatingMode().getDisplayName());
        } else {
            modeLabel.setText("");
        }
    }
}
