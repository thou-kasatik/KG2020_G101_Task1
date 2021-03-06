package com.company;

import java.awt.*;

public class FrontSide implements Drawable {
    private int[] x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
    private int n1, n2, n3, n4;

    FrontSide(int[] x1, int[] y1, int[] x2, int[] y2, int[] x3, int[] y3, int[] x4, int[] y4, int[] x5, int[] y6, int n1, int n2, int n3, int n4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.x5 = x5;
        this.y5 = y6;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    private static void DrawHeadlights(Graphics2D g, int[] x, int[] y, int n) {
        g.setStroke(new BasicStroke(12));
        g.setColor(Color.WHITE);
        g.drawPolyline(x, y, n);
    }

    private static void DrawCapote(Graphics2D g, int[] x, int[] y, int n) {
        GradientPaint Paint = new GradientPaint(0, 100, Color.GRAY, 50, 43, Color.LIGHT_GRAY);
        g.setPaint(Paint);
        g.fillPolygon(x, y, n);
    }

    private static void DrawWindow(Graphics2D g, int[] x, int[] y, int n) {
        g.setStroke(new BasicStroke(10));
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(x[1]-2, y[1], x[2]-2, y[2]);

        g.setStroke(new BasicStroke(5));
        g.setColor(Color.GRAY);
        g.drawPolygon(x, y, n);

        GradientPaint pt = new GradientPaint(170, 100, new Color(0, 134, 207), 150, 143, Color.CYAN);
        g.setPaint(pt);
        g.fillPolygon(x, y, n);

        g.setStroke(new BasicStroke(10));
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(x[2] , y[2], x[3] , y[3]+1);

    }

    private static void DrawBumper(Graphics2D g, int[] x, int[] y, int n) {
        g.setColor(Color.LIGHT_GRAY);
        g.setStroke(new BasicStroke(7));
        g.fillPolygon(x, y, n);
    }

    private static void DrawLowBumper(Graphics2D g, int[] x, int[] y, int n) {
        g.setColor(new Color(219, 94, 26));
        g.setStroke(new BasicStroke(5));
        g.drawLine(x[2] - 5, y[2], 208, 460);
        g.drawLine(x[0] - 5, y[0]-20 , x[1] + 5, y[1] -20);

        g.setStroke(new BasicStroke(38));
        g.setColor(Color.BLACK);
        g.drawPolyline(x, y, n);
    }

    @Override
    public void draw(Graphics2D g) {
        DrawBumper(g, x4, y4, n4);
        DrawHeadlights(g, x1, y1, n1);
        DrawCapote(g, x2, y2, n2);
        DrawWindow(g, x3, y3, n3);
        DrawLowBumper(g, x5, y5, n4 - 2);
    }
}
