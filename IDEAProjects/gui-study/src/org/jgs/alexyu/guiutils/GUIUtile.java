package org.jgs.alexyu.guiutils;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author alex-ycp
 * @create 2021-06-17 10:45
 */
public class GUIUtile {
    public static void windowClosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
