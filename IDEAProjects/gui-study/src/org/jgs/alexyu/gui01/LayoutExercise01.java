package org.jgs.alexyu.gui01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author alex-ycp
 * @create 2021-06-16 20:53
 */
public class LayoutExercise01 {

    public static void main(String[] args) {
        Frame frame = new Frame("LayoutExercise01");
        frame.setLayout(new GridLayout(2,1));
        frame.setBounds(100,100,440,300);
        frame.setBackground(new Color(211,231,1));

        Panel panelTop = new Panel(new BorderLayout());
        Panel panelBottom = new Panel(new BorderLayout());
        Panel panelTC = new Panel(new GridLayout(2,1));
        Panel panelBC = new Panel(new GridLayout(2,2));

        panelTop.add(new Button("East_t"),BorderLayout.EAST);
        panelTop.add(new Button("West_t"),BorderLayout.WEST);
        panelTC.add(new Button("top1"));
        panelTC.add(new Button("top2"));
        panelTop.add(panelTC,BorderLayout.CENTER);

        panelBottom.add(new Button("East_b"),BorderLayout.EAST);
        panelBottom.add(new Button("West_b"),BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            panelBC.add(new Button("top"+i));
        }
        panelBottom.add(panelBC,BorderLayout.CENTER);

        frame.add(panelTop);
        frame.add(panelBottom);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }


}
