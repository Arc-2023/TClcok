package org.example.Clock;

import org.example.Function.ClockPaintImpl;

import javax.swing.*;
import java.awt.*;

public class BottomTime extends JPanel {
    public String time;
    public BottomTime(String time) {
        this.time = time;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        FontMetrics fm=g.getFontMetrics();
        int stringWidth=fm.stringWidth(time);
        int stringAscent=fm.getAscent();
        int framewidth = getWidth() / 2;
        int frameheight = getHeight() / 2;
        ClockPaintImpl clockPaint = new ClockPaintImpl();

        clockPaint.paintTime(g,framewidth,frameheight,stringWidth,stringAscent,time);
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200,30);
    }
}
