package org.example.Clock;

import org.example.Function.ClockPaintImpl;

import java.awt.*;
import java.time.LocalDateTime;

public class MyClock extends Clock {
    public MyClock(LocalDateTime time){
        this.time=time;
    }
    public Integer getHours() {
        return time.getHour();
    }
    public Integer getMinutes() {
        return time.getMinute();
    }
    public Integer getSeconds() {
        return time.getSecond();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Integer Radius=(int) (getWidth() * 0.4);
        Integer xCenter=getWidth()/2;
        Integer yCenter=getHeight()/2;
        int LengthSecond=(int)(Radius*0.9);
        int mLength=(int)(Radius*0.7);
        int hLength=(int)(Radius*0.5);
        ClockPaintImpl clockPaint = new ClockPaintImpl();

        //Draw Circle
        clockPaint.paintCircle(g,xCenter,yCenter,Radius);

        //Draw String
        g.drawString("12",xCenter-5,yCenter-Radius+12);
        g.drawString("9",xCenter-Radius+3,yCenter+5);
        g.drawString("3",xCenter+Radius-10,yCenter+3);
        g.drawString("6",xCenter-3,yCenter+Radius-3);

        //Draw sec line
        clockPaint.paintLine(g,xCenter,yCenter,LengthSecond,time.getSecond());
        //Draw min line
        clockPaint.paintLine(g,xCenter,yCenter,mLength,time.getMinute());
        //Draw hour line
        clockPaint.paintHourLine(g,xCenter,yCenter,hLength,time.getHour());
    }
    public Dimension getPreferredSize(){
        return new Dimension(200,200);
    }
}
