package org.jgs.alexyu.gui01;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author alex-ycp
 * @create 2021-06-17 10:28
 */
public class TestActionEvent {
    public static void main(String[] args) {
        // 按下按钮,触发一些事件
        Frame frame = new Frame("TestActionEvent");
        frame.setSize(200,150);
        frame.setVisible(true);
        Button btn1 = new Button("Click");

        btn1.addActionListener((e)->{
            System.out.println("带你非");
        });

        frame.add(btn1);
        GUIUtile.windowClosing(frame); // 关闭窗口

    }
}
