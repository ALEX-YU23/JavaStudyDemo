package org.jgs.alexyu.gui05;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 20:24
 */
public class JButton03 extends JFrame {

    public JButton03() {
        Container container = this.getContentPane();

        // 多选框
        Checkbox checkbox01 = new Checkbox("checkbox01");
        Checkbox checkbox02 = new Checkbox("checkbox02");
        Checkbox checkbox03 = new Checkbox("checkbox03");

        // 放到容器中去
        container.add(checkbox01,BorderLayout.CENTER);
        container.add(checkbox02,BorderLayout.NORTH);
        container.add(checkbox03,BorderLayout.SOUTH);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,560,450);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new JButton03();
    }
}
