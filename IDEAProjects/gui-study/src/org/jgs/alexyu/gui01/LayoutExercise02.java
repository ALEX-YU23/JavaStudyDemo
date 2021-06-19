package org.jgs.alexyu.gui01;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author alex-ycp
 * @create 2021-06-16 20:53
 */
public class LayoutExercise02 {
    /**
     * 两个按钮实现同一个监听
     * 开始     停止
     * @param args
     */
    public static void main(String[] args) {
        Frame frame = new Frame("开始-停止");
        frame.setLayout(new GridLayout(2,1));
        frame.setBounds(100,100,440,300);
        frame.setBackground(new Color(211,231,1));

        Button btn1 = new Button("Start");
        Button btn2 = new Button("Stop");

        MyActionListener myActionListener = new MyActionListener();
        btn1.addActionListener(myActionListener);
        btn1.setActionCommand("start");
        btn2.addActionListener(myActionListener);
        btn2.setActionCommand("stop");

        frame.add(btn1,BorderLayout.CENTER);
        frame.add(btn2,BorderLayout.CENTER);


        frame.setVisible(true);

        GUIUtile.windowClosing(frame);
    }


}
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("start".equals(e.getActionCommand())){
            System.out.println("start");
        }
        if ("stop".equals(e.getActionCommand())){
            System.out.println("stop");
        }

    }
}