package org.jgs.alexyu.snake;

import javax.swing.*;

/**
 * 游戏的主启动类
 * @author alex-ycp
 * @create 2021-06-19 16:02
 */
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("贪吃蛇");

        // 正常游戏界面都应该在面板上
        frame.add(new GamePanel());

        frame.setBounds(100,100,900,720);
        frame.setResizable(false);// 窗口大小不可变
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
