package userInterface;

import java.awt.*;
import javax.swing.*;

final class SpeedBar extends JPanel {
    private int currentLevel;
    private int maxLevel;

    SpeedBar() {
        setPreferredSize(new Dimension(240, 150));
        setBackground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    void setCurrentLevel(int level) {
        this.maxLevel = Math.max(1, 5);
        this.currentLevel = Math.clamp(level, 0, this.maxLevel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int pad = 14;
        int w = getWidth();
        int h = getHeight();
        int baseY = h - pad;
        int maxRightX = w - pad;
        int maxHeight = h - 2 * pad;

        double f = (double) currentLevel / maxLevel;
        int rightX = pad + (int) (f * (maxRightX - pad));
        int topY = baseY - (int) (f * maxHeight);

        int[] xs = {pad, rightX, rightX };
        int[] ys = { baseY, baseY, topY };
        g2.setColor(new Color(0, 168, 255));
        g2.fillPolygon(xs, ys, 3);

        g2.dispose();
    }
}