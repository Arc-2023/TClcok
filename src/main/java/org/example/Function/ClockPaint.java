package org.example.Function;

import java.awt.*;

public interface ClockPaint {
    void paintCircle(Graphics g, Integer CenterX, Integer CenterY, Integer Radius);

    void paintLine(Graphics g, Integer x, Integer y, Integer len, Integer value);

    void paintHourLine(Graphics g, Integer x, Integer y, Integer len, Integer value);

    void paintTime(Graphics g, int x, int y, int width, int height, String message);
}
