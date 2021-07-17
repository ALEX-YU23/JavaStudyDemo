package org.jgs.alexyu.gui06;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-19 11:49
 */
public class TestTextDemo02 extends JFrame {
    public TestTextDemo02() {
        Container container = this.getContentPane();

        // 用面板做
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        container.add(passwordField);
        this.setVisible(true);
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo02();
    }
}
