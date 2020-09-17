package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private int[] xPointsUpSide = {500, 800, 1100};
    private int[] yPointsUpSide = {450, 250, 300};

    private int[] xPointsDownSide = {490, 1115, 1100, 475};
    private int[] yPointsDownSide = {455, 300, 450, 600};

    private int[] xPointsLights = {488, 400, 220, 202};
    private int[] yPointsLights = {455, 460, 400, 370};

    private int[] xPointsCapote = {495, 400, 215, 200, (xPointsUpSide[1] + xPointsUpSide[0]) / 2 - 295, (xPointsUpSide[1] + xPointsUpSide[0]) / 2, 55};
    private int[] yPointsCapote = {450, 455, 395, 365, (yPointsUpSide[1] + yPointsUpSide[0]) / 2 - 70, (yPointsUpSide[1] + yPointsUpSide[0]) / 2, 55};

    private int[] xPointsWindow = {xPointsCapote[5], xPointsCapote[4], 495, xPointsUpSide[1]};
    private int[] yPointsWindow = {yPointsCapote[5], yPointsCapote[4], 187, yPointsUpSide[1]};

    private int[] xPointsBumper = {500, (xPointsDownSide[0] + xPointsDownSide[3]) / 2, xPointsCapote[1], xPointsCapote[2] - 5, xPointsCapote[3] - 3};
    private int[] yPointsBumper = {450, (yPointsDownSide[0] + yPointsDownSide[3]) / 2 + 30, (yPointsDownSide[0] + yPointsDownSide[3]) / 2 + 30, yPointsCapote[2] + 100, yPointsCapote[3] + 4};

    private LeftSide ls = new LeftSide(xPointsUpSide, yPointsUpSide, xPointsDownSide, yPointsDownSide, 3, 4);
    private FrontSide fs = new FrontSide(xPointsLights, yPointsLights, xPointsCapote, yPointsCapote, xPointsWindow, yPointsWindow, xPointsBumper, yPointsBumper, 4, 6, 4, 5);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        fs.draw(gr);
        ls.draw(gr);
    }
}
