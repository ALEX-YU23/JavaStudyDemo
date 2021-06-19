package org.jgs.alexyu.gui01;

import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-16 20:27
 */
public class TestBorderLayout {
    public static void main(String[] args) {

        Frame frame = new Frame("TestBorderLayout");

        Button east = new Button("East");
        Button west = new Button("West");
        Button north = new Button("North");
        Button south = new Button("South");
        Button center = new Button("Center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setBounds(100,100,200,200);
        frame.setVisible(true);
    }
}
