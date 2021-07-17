package org.jgs.alexyu.gui06;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-19 11:49
 */
public class TestTextDemo01 extends JFrame {
    public TestTextDemo01() {
        Container container = this.getContentPane();

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world",20);
        JTextField textField3 = new JTextField("师姐你好",20);

        container.add(textField1,BorderLayout.NORTH);
        container.add(textField2,BorderLayout.SOUTH);
        container.add(textField3,BorderLayout.CENTER);



        this.setVisible(true);
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
