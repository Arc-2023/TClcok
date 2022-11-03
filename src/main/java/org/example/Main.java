package org.example;

import org.example.Space.MySpace;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MySpace space = new MySpace();
        space.setTitle("MyClock");
        space.setSize(400,400);
        space.setLocationRelativeTo(null);
        space.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        space.setVisible(true);
        //System.setProperty("awt.useSystemAAFontSettings", "on");
        //System.setProperty("swing.aatext", "true");
        space.drawClock();
    }
}