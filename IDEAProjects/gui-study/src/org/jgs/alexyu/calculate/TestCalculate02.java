package org.jgs.alexyu.calculate;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 简易计算器   组合对象实现
 * @author alex-ycp
 * @create 2021-06-17 11:49
 */
public class TestCalculate02 {
    public static void main(String[] args) {
        // 启动
        new Calculate2().loadFrame();
    }
}

/* 计算器类 */
class Calculate2 extends Frame{
    TextField numtext1,numtext2,result;

    public void loadFrame(){
        setLayout(new FlowLayout());
        // 3个文本框
        numtext1 = new TextField(10);
        numtext2 = new TextField(10);
        result = new TextField(20);
        // 1个按钮
        Button equals = new Button("=");
        equals.addActionListener(new MyCalListener2(this));

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

}

// 监听器类
class MyCalListener2 implements ActionListener{
    // 在一个类中组合另一个类
    private Calculate2 calculate2 = null;

    public MyCalListener2(Calculate2 calculate2){
        this.calculate2 = calculate2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1. 获得加数和被加数
        int addend = Integer.parseInt(calculate2.numtext1.getText());
        int augend = Integer.parseInt(calculate2.numtext2.getText());
        int res = addend + augend;
        // 2. 将这个值 + 法运算后,放到第三个框
        calculate2.result.setText(res+"");
        // 3.清除前两个框
        calculate2.numtext1.setText("");
        calculate2.numtext2.setText("");
    }
}