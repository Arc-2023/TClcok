package org.example.Space;

import org.example.Clock.MyClock;
import org.example.Clock.BottomTime;

import java.awt.*;
import java.time.LocalDateTime;

public class MySpace extends Space{
    public void drawClock(){
        Thread thread = new Thread(() -> {
            while (true){
                time= LocalDateTime.now();
                MyClock clock = new MyClock(time);
                BottomTime bottomTime =new BottomTime(
                        clock.getHours()
                                + ":"
                                + clock.getMinutes()
                                + ":"
                                + clock.getSeconds());
                bottomTime.setForeground(Color.black);
                add(clock);
                add(bottomTime,BorderLayout.SOUTH);
                validate();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //clock.setVisible(false);
                remove(clock);
                clock.invalidate();
            }
        });
        thread.start();
    }
}
