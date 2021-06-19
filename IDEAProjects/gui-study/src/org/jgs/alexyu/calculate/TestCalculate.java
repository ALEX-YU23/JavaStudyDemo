package org.jgs.alexyu.calculate;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 简易计算器
 * @author alex-ycp
 * @create 2021-06-17 11:49
 */
public class TestCalculate {
    public static void main(String[] args) {
        // 启动
        new Calculate();
    }
}
/* 计算器类 */
class Calculate extends Frame{
    public Calculate(){
        setLayout(new FlowLayout());
        // 3个文本框
        TextField numtext1 = new TextField(10);
        TextField numtext2 = new TextField(10);
        TextField result = new TextField(20);
        // 1个按钮
        Button equals = new Button("=");
        equals.addActionListener(new MyCalListener(numtext1,numtext2,result));

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
class MyCalListener implements ActionListener{
    // 获取三个变量
    private TextField numtext1;
    private TextField numtext2;
    private TextField result;

    public MyCalListener(TextField numtext1,TextField numtext2,TextField result){
        this.numtext1 = numtext1;
        this.numtext2 = numtext2;
        this.result = result;
    }

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