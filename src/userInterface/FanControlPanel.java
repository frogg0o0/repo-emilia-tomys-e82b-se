package userInterface;

import java.awt.*;
import javax.swing.*;

import fanLogic.FanController;

final class FanControlPanel extends JPanel {

    private final transient FanController controller;
    private final SpeedBar speedBar;

    FanControlPanel(FanController controller) {
        this.controller = controller;
        this.speedBar = new SpeedBar();

        setLayout(new BorderLayout(12, 12));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton lower = new JButton("-");
        JButton raise = new JButton("+");
        lower.setFont(lower.getFont().deriveFont(Font.BOLD, 28f));
        raise.setFont(raise.getFont().deriveFont(Font.BOLD, 28f));
        lower.addActionListener(e -> controller.lowerSpeed());
        raise.addActionListener(e -> controller.raiseSpeed());

        JPanel center = new JPanel(new BorderLayout(0, 6));
        center.add(speedBar, BorderLayout.CENTER);

        add(lower, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(raise, BorderLayout.EAST);

        refreshDisplay();
    }

    /**
     * Refreshes the speed bar display depending on the motor state.
     */
    public void refreshDisplay() {
        if (controller.isOn()) {
            int level = controller.getCurrentLevel().getLevel();
            speedBar.setCurrentLevel(level);
            speedBar.repaint();
        } else {
            speedBar.setCurrentLevel(0);
        }
        speedBar.repaint();
    }
}
