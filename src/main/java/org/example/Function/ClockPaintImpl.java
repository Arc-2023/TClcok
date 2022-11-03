package org.example.Function;

import java.awt.*;

public class ClockPaintImpl implements ClockPaint{
    @Override
    public void paintCircle(Graphics g, Integer CenterX, Integer CenterY, Integer Radius){
        g.setColor(Color.BLACK);
        g.drawOval(CenterX-Radius,CenterY-Radius,2*Radius,2*Radius);
    }
    @Override
    public void paintLine(Graphics g, Integer x, Integer y, Integer len, Integer value){
        int xRotate =(int)(x + len * Math.sin( value * (2 * Math.PI / 60)));
        int yRotate =(int)(y - len * Math.cos( value * (2 * Math.PI / 60)));
        g.setColor(Color.BLACK);
        g.drawLine(x,y,xRotate,yRotate);
    }
    @Override
    public void paintHourLine(Graphics g, Integer x, Integer y, Integer len, Integer value){
        int xRotate =(int)(x + len * Math.sin((2*Math.PI/12)*value));
        int yRotate = (int)(y - len * Math.cos((2*Math.PI/12)*value));
        g.setColor(Color.BLACK);
        g.drawLine(x,y,xRotate,yRotate);
    }
    @Override
    public void paintTime(Graphics g,int x,int y,int width,int height,String message){
        g.drawString(message,x-width/2,y-height/2);
    }


}
