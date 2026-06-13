package userInterface;

import fanLogic.FanController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class PowerButtonUIHandler {
    private static final long LONG_PRESS_MS = 500;
    private long pressStartInMilliSeconds;

    PowerButtonUIHandler(JButton button, FanController controller, GUI gui) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pressStartInMilliSeconds = System.currentTimeMillis();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                long duration = System.currentTimeMillis() - pressStartInMilliSeconds;
                if (duration >= LONG_PRESS_MS) {
                    controller.togglePower();
                    gui.refreshDisplays();
                }
            }

        });
    }
}