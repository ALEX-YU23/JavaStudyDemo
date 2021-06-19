package org.jgs.alexyu.gui01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author alex-ycp
 * @create 2021-06-16 20:09
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        // 组件按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        // 设置为流式布局
        //frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setSize(200,200);

        //把按钮添加到frame中
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);

        // 窗口关闭事件监听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



    }

}
