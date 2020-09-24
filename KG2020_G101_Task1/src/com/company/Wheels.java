package com.company;

import java.awt.*;

public class Wheels implements Drawable {
    private int x, y, r, R, n;
    private int[] x1, y1;


    Wheels(int x, int y, int r, int R, int n, int[] x1, int[] y1) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.R = R;
        this.n = n;
        this.x1 = x1;
        this.y1 = y1;
    }

    private static void drawWheel(Graphics2D g, int x, int y, int R, int r) {
        g.setStroke(new BasicStroke(21));
        g.setColor(new Color(32, 34, 33));
        g.fillOval(x, y, R, r);
        g.setColor(Color.BLACK);
        g.fillOval(x + 35, y + 40, R / 2, r / 2);
    }

    private static void drawArcs(Graphics2D g, int[] x, int[] y, int n) {
        g.setStroke(new BasicStroke(24));
        g.drawPolyline(x, y, n);
    }

    @Override
    public void draw(Graphics2D g) {
        drawWheel(g, x, y, R, r);
        drawArcs(g, x1, y1, n);
    }
}
