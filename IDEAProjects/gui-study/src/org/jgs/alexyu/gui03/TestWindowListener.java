package org.jgs.alexyu.gui03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author alex-ycp
 * @create 2021-06-18 14:44
 */
public class TestWindowListener {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{

    public WindowFrame(){
        setBounds(100,100,100,100);
        setBackground(Color.BLUE);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            // 关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                //setVisible(false); //隐藏窗口, 通过按钮隐藏窗口
                System.exit(0);  // 正常退出
            }
            // 激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame windowFrame = (WindowFrame)e.getSource();
                windowFrame.setTitle("xixixixixi");
                System.out.println("windowActivated");
            }
        });
    }

//    class MyWindowListener extends WindowAdapter{
//        @Override
//        public void windowClosing(WindowEvent e) {
//
//        }
//    }
}