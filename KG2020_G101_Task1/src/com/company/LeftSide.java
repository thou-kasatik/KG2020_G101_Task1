package com.company;

import java.awt.*;

public class LeftSide implements Drawable {
    private int[] x1, y1, x2, y2, x3, y3;
    private int n1, n2;

    LeftSide(int[] x1, int[] y1, int[] x2, int[] y2, int[] x3, int[] y3, int n1, int n2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.n1 = n1;
        this.n2 = n2;
    }

    private static void drawUpSide(Graphics2D g, int[] x, int[] y, int n) {
        GradientPaint Paint = new GradientPaint(0, 140, Color.GRAY, 50, 53, Color.LIGHT_GRAY);
        g.setPaint(Paint);
        g.setStroke(new BasicStroke(7));
        g.drawPolygon(x, y, n);
        g.fillPolygon(x, y, n);
    }

    private static void drawDownside(Graphics2D g, int[] x, int[] y, int n) {
        GradientPaint Paint = new GradientPaint(5, 110, Color.GRAY, 50, 43, Color.LIGHT_GRAY);
        g.setPaint(Paint);
        g.fillPolygon(x, y, n);
    }

    private static void drawDoors(Graphics2D g, int[] x, int[] y, int n) {
        g.setStroke(new BasicStroke(9));
        g.setColor(Color.GRAY);
        g.drawPolygon(x, y, n);

        int[] xWindow = {x[0], x[1], x[2], x[5], x[6]};
        int[] yWindow = {y[0], y[1], y[2], y[5], y[6]};


        GradientPaint pt = new GradientPaint(170, 100, new Color(0, 134, 207), 150, 143, Color.CYAN);
        g.setPaint(pt);
        g.fillPolygon(xWindow, yWindow, 5);

        g.setStroke(new BasicStroke(7));
        g.setColor(Color.GRAY);
        g.drawLine(x[2], y[2], x[5], y[5]);


        int[] xFrame = {x[1] - 4, x[2] - 5, x[5] + 3, x[6] + 4};
        int[] yFrame = {y[1] + 5, y[2] - 5, y[5] - 5, y[6] + 1};

        g.setStroke(new BasicStroke(7));
        g.setColor(Color.GRAY);
        g.drawLine((xFrame[1] + xFrame[2]) / 2, (yFrame[1] + yFrame[2]) / 2, (x[3] + x[4]) / 2, (y[3] + y[4]) / 2);

        g.setStroke(new BasicStroke(8));
        g.setColor(Color.BLACK);
        g.drawPolyline(xFrame, yFrame, 4);
        g.drawLine(x[0], y[0] + 5, (xFrame[1] + xFrame[2]) / 2, (yFrame[1] + yFrame[2]) / 2);

        g.setStroke(new BasicStroke(7));
        g.setColor(new Color(78, 85, 96));
        g.drawLine(x[2], y[2], x[5], y[5]);

        g.setColor(Color.GRAY);
        g.setStroke(new BasicStroke(10));
        g.drawLine(790, 400, 770, 405);
        g.drawLine(940, 365, 920, 370);

    }

    @Override
    public void draw(Graphics2D g) {
        drawDownside(g, x2, y2, n2);
        drawUpSide(g, x1, y1, n1);
        drawDoors(g, x3, y3, n2 + 3);
    }
}
