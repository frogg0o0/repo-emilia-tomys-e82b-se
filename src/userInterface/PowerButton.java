package userInterface;

import java.awt.*;
import javax.swing.*;

final class PowerButton extends JButton {
    PowerButton() {
        super("⏻");
        setFont(getFont().deriveFont(Font.BOLD, 32f));
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(64, 64));
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color c = new Color(255, 147, 147);
        int d = Math.min(getWidth(), getHeight()) - 2;
        int x = (getWidth() - d) / 2, y = (getHeight() - d) / 2;
        g2.setColor(c);
        g2.fillOval(x, y, d, d);
        g2.dispose();
        super.paintComponent(g);
    }
}