package org.jgs.alexyu.gui05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author alex-ycp
 * @create 2021-06-18 20:24
 */
public class JButton02 extends JFrame {

    public JButton02() {
        Container container = this.getContentPane();

        // 单选框
        JRadioButton radioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton02 = new JRadioButton("JRadioButton02");
        JRadioButton radioButton03 = new JRadioButton("JRadioButton03");

        // 由于单选框只能选择一个,分组 ,一个组中只能选择一个
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);

        container.add(radioButton01,BorderLayout.NORTH);
        container.add(radioButton02,BorderLayout.CENTER);
        container.add(radioButton03,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,560,450);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new JButton02();
    }
}
