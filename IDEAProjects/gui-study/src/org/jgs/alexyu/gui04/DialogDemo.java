package org.jgs.alexyu.gui04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author alex-ycp
 * @create 2021-06-18 18:46
 */
// 主窗口
public class DialogDemo extends JFrame {

    public DialogDemo(){
        this.setVisible(true);
        this.setSize(700,500);
        this.setBackground(Color.YELLOW);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // JFrame放东西, 容器
        Container container = this.getContentPane();
        // 绝对布局
        container.setLayout(null);

        //按钮
        JButton button = new JButton("弹窗"); // 创建
        button.setBounds(30,30,200,50);

        // 点击按钮的时候,弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 弹窗
                new MyDialogDemo();
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }

}
// 弹窗的窗口
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,400,400);
        Container container = this.getContentPane();

        container.setLayout(null);

        // 设置文字JLabel
        JLabel label = new JLabel("欢迎来到狂神说java系列");
        add(label);

        // 让文本标签居中
        label.setBounds(50, 50, 150, 50);//这个事我加的，因为用null布局就要设置显示的坐标及大小
        label.setHorizontalAlignment(SwingConstants.CENTER);



    }
}