package org.jgs.alexyu.calculate;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 简易计算器   内部类实现
 * @author alex-ycp
 * @create 2021-06-17 11:49
 */
public class TestCalculate03 {
    public static void main(String[] args) {
        // 启动
        new Calculate3().loadFrame();
    }
}

/* 计算器类 */
class Calculate3 extends Frame{
    TextField numtext1,numtext2,result;

    public void loadFrame(){
        setLayout(new FlowLayout());
        // 3个文本框
        numtext1 = new TextField(10);
        numtext2 = new TextField(10);
        result = new TextField(20);
        // 1个按钮
        Button equals = new Button("=");
        equals.addActionListener(new MyCalListener3());

        // 1个标签
        Label lplus = new Label("+");

        add(numtext1);
        add(lplus);
        add(numtext2);
        add(equals);
        add(result);
        pack();

        setSize(500,80);
        setVisible(true);

        GUIUtile.windowClosing(this);
    }

    // 监听器类  内部类  内部类最大的好处，就是可以畅通无阻的访向外部的属性和方法!
    private class MyCalListener3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. 获得加数和被加数
            int addend = Integer.parseInt(numtext1.getText());
            int augend = Integer.parseInt(numtext2.getText());
            int res = addend + augend;
            // 2. 将这个值 + 法运算后,放到第三个框
            result.setText(res+"");
            // 3.清除前两个框
            numtext1.setText("");
            numtext2.setText("");
        }
    }
}

