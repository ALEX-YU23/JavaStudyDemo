package org.jgs.alexyu.gui01;

import java.awt.*;

/**
 * GUI的第一个界面
 * @author alex-ycp
 * @create 2021-06-16 19:21
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个图形界面窗口");

        //需要设置可见性
        frame.setVisible(true);

        // 设置窗口大小
        frame.setSize(400,400);

        // 设置背景颜色
        Color color = new Color(29, 203, 117);
        frame.setBackground(color);

        // 弹出的初始位置
        frame.setLocation(40,40);

        // 设置大小固定
        frame.setResizable(false);

        // 解决窗口关闭不了的问题

    }
}
