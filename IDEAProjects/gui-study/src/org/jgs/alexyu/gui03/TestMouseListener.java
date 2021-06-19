package org.jgs.alexyu.gui03;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 测试鼠标监听事件
 * @author alex-ycp
 * @create 2021-06-18 13:44
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

// 自己的类
class MyFrame extends Frame{
    // 画画需要画笔,需要监听鼠标当前的位置,需要集合来存储这个点
    ArrayList<Point> points = new ArrayList();
    public MyFrame(String title) {
        super(title);
        setBounds(200,200,560,340);
        setVisible(true);
        // 鼠标监听器,针对窗口
        this.addMouseListener(new MyMouseListener());

        GUIUtile.windowClosing(this);
    }

    @Override
    public void paint(Graphics g) {
        // 画画,监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point)iterator.next();
            g.setColor(Color.red);
            g.fillOval(point.x, point.y,15,15);
        }
    }
    // 适配器模式
    private class MyMouseListener extends MouseAdapter{
        // 鼠标点击, 按下,弹起

        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame)e.getSource();
            // 这里我们点击的时候,就会在界面上产生一个点!画
            // 这个点就是鼠标的点
            points.add(e.getPoint());

            // 每次点击鼠标都需要重画一遍
            myFrame.repaint(); //刷新,执行上面的paint方法
        }
    }

}