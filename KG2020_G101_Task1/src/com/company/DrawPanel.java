package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private int[] xPointsUpSide = {500, 800, 1100};
    private int[] yPointsUpSide = {450, 250, 300};

    private int[] xPointsDownSide = {490, 1115, 1100, 475};
    private int[] yPointsDownSide = {455, 300, 450, 590};

    private int[] xPointsDoors = {810, 950, 960, 950, 650, 660, 655};
    private int[] yPointsDoors = {270, 290, 340, 465, 535, 415, 370};

    private int[] xPointsLights = {488, 400, 220, 202};
    private int[] yPointsLights = {455, 460, 400, 370};

    private int[] xPointsCapote = {495, 400, 215, 200, (xPointsUpSide[1] + xPointsUpSide[0]) / 2 - 295, (xPointsUpSide[1] + xPointsUpSide[0]) / 2, 55};
    private int[] yPointsCapote = {450, 455, 395, 365, (yPointsUpSide[1] + yPointsUpSide[0]) / 2 - 70, (yPointsUpSide[1] + yPointsUpSide[0]) / 2, 55};

    private int[] xPointsWindow = {xPointsCapote[5] , xPointsCapote[4] +10, 505, xPointsUpSide[1]};
    private int[] yPointsWindow = {yPointsCapote[5] , yPointsCapote[4] , 187, yPointsUpSide[1]};

    private int[] xPointsBumper = {500, (xPointsDownSide[0] + xPointsDownSide[3]) / 2, xPointsCapote[1], xPointsCapote[2] - 5, xPointsCapote[3] - 3};
    private int[] yPointsBumper = {450, (yPointsDownSide[0] + yPointsDownSide[3]) / 2 + 30, (yPointsDownSide[0] + yPointsDownSide[3]) / 2 + 30, yPointsCapote[2] + 100, yPointsCapote[3] + 4};

    private int[] xPointsDownBumper = {xPointsBumper[1], xPointsBumper[2], xPointsBumper[3] + 5};
    private int[] yPointsDownBumper = {yPointsBumper[1] + 20, yPointsBumper[2] + 20, yPointsBumper[3] + 20};

    private int[] xPointsArcs = {490, 510, 610, 635, 960, 980, 1070, 1090};
    private int[] yPointsArcs = {580, 505, 485, 555, 480, 405, 390, 450};

    private int[] xPointsRoad = {0, 1500};
    private int[] yPointsRoad = {950, 200};

    private LeftSide ls = new LeftSide(xPointsUpSide, yPointsUpSide, xPointsDownSide, yPointsDownSide, xPointsDoors, yPointsDoors, 3, 4);
    private FrontSide fs = new FrontSide(xPointsLights, yPointsLights, xPointsCapote, yPointsCapote, xPointsWindow, yPointsWindow, xPointsBumper, yPointsBumper, xPointsDownBumper, yPointsDownBumper, 4, 6, 4, 5);
    private Wheels w1 = new Wheels(500, 487, 160, 125, 8, xPointsArcs, yPointsArcs);
    private Wheels w2 = new Wheels(960, 390, 160, 125, 8, xPointsArcs, yPointsArcs);
    private Wheels w3 = new Wheels(235, 420, 160, 125, 8, xPointsArcs, yPointsArcs);
    private Road r = new Road(xPointsRoad, yPointsRoad);


    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        r.draw(gr);
        w3.draw(gr);
        ls.draw(gr);
        fs.draw(gr);
        w1.draw(gr);
        w2.draw(gr);
    }
}
