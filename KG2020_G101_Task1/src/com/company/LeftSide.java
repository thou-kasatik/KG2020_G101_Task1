package com.company;

import java.awt.*;

public class LeftSide implements Drawable {
    private int[] x1, y1, x2, y2;
    private int n1, n2;

    LeftSide(int[] x1, int[] y1, int[] x2, int[] y2, int n1, int n2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.n1 = n1;
        this.n2 = n2;
    }

    private static void drawUpSide(Graphics2D g, int[] x, int[] y, int n) {
        g.setColor(Color.LIGHT_GRAY);
        g.setStroke(new BasicStroke(7));
        g.drawPolygon(x, y, n);
    }

    private static void drawDownside(Graphics2D g, int[] x, int[] y, int n) {
        GradientPaint Paint = new GradientPaint(0, 140, Color.GRAY, 50, 43, Color.LIGHT_GRAY);
        g.setPaint(Paint);
        g.fillPolygon(x, y, n);
    }

    @Override
    public void draw(Graphics2D g) {
        drawDownside(g, x2, y2, n2);
        drawUpSide(g, x1, y1, n1);

    }
}
