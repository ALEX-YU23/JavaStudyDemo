package org.jgs.alexyu.gui01;

import java.awt.*;

/**
 * 展示多个窗口
 * @author alex-ycp
 * @create 2021-06-16 19:21
 */
public class TestFrame2 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.BLUE);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.PINK);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.YELLOW);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.RED);

    }
}

class MyFrame extends Frame{
    static int id = 0; // 可能存在多个窗口,计数器

    public MyFrame(int x,int y ,int w,int h,Color color){
        super("MyFrame" + (++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}