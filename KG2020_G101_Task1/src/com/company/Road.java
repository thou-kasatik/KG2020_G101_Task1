package com.company;

import java.awt.*;

public class Road implements Drawable {
    private int[] x, y;

    Road(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    private static void drawRoad(Graphics2D g, int[] x, int[] y) {
        g.setColor(new Color(216, 169, 3));
        g.setStroke(new BasicStroke(5000));
        g.drawLine(0, 0, 2000, 2000);

        g.setStroke(new BasicStroke(880));
        g.setColor(Color.darkGray);
        g.drawLine(x[0], y[0], x[1], y[1]);
    }

    private static void drawRelief(Graphics2D g) {
        g.setColor(Color.GRAY);
        int[] xPointsStone = {120, 135, 175, 210, 230, 170};
        int[] yPointsStone = {160, 135, 125, 140, 160, 160};
        g.fillPolygon(xPointsStone, yPointsStone, 6);

        g.setColor(Color.GREEN);
        int[] xPointsCactus1 = {110, 80, 80, 20, 20, 50, 50, 80, 80, 110, 110, 140, 140, 170, 170, 110};
        int[] yPointsCactus1 = {390, 390, 270, 240, 180, 180, 240, 240, 90, 90, 240, 240, 150, 150, 240, 270};
        g.fillPolygon(xPointsCactus1, yPointsCactus1, 16);
        int[] xPointsCactus2 = {270, 260, 260, 240, 240, 250, 250, 260, 260, 270, 270, 280, 280, 290, 290, 270};
        int[] yPointsCactus2 = {230, 230, 190, 180, 160, 160, 180, 180, 130, 130, 180, 180, 150, 150, 180, 190};
        g.fillPolygon(xPointsCactus2, yPointsCactus2, 16);

    }

    private static void drawBorder(Graphics2D g) {
        g.setColor(Color.GRAY);
        int[] xPointsBorder = {};
        int[] yPointsBorder = {};

    }


    @Override
    public void draw(Graphics2D g) {
        drawRoad(g, x, y);
        drawRelief(g);
    }
}
