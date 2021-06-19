package org.jgs.alexyu.gui03;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 11:31
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(100,100,600,500);
//        pack();
        setVisible(true);
        GUIUtile.windowClosing(this);
    }

    @Override
    public void paint(Graphics g) {
        // 画笔需要颜色
        g.setColor(Color.MAGENTA);
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100); // 实心圆

        g.setColor(Color.green);
        g.drawRect(150,250,150,150);

        // 养成习惯,画笔用完,将它还原成最初的颜色
        g.setColor(Color.BLACK);

    }
}