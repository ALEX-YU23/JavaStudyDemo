package org.jgs.alexyu.gui04;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 18:00
 */
public class TestJFrame {

    // init(); 初始化
    public void init(){
        // 顶级窗口

        JFrame jf = new JFrame("这是一个JFrame窗口");
        jf.setVisible(true);
        jf.setBounds(100,100,340,200);

        // 设置文字JLabel
        JLabel label = new JLabel("欢迎来到狂神说java系列");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        jf.add(label);

        // 容器实例化
        Container container = jf.getContentPane();
        container.setBackground(new Color(112,111,222));

        // 关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestJFrame().init();
    }
}
