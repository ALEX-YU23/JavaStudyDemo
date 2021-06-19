package org.jgs.alexyu.gui05;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 19:57
 */
public class JPanelDemo extends JFrame {
    public JPanelDemo() {
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(2,2,10,10));//后面两个参数表示间距

        JPanel jPanel1 = new JPanel(new GridLayout(1,3));
        JPanel jPanel2 = new JPanel(new GridLayout(1,2));
        JPanel jPanel3 = new JPanel(new GridLayout(2,2));
        JPanel jPanel4 = new JPanel(new GridLayout(3,2));

        jPanel1.add(new Button("1"));
        jPanel1.add(new Button("1"));
        jPanel1.add(new Button("1"));

        jPanel2.add(new Button("2"));
        jPanel2.add(new Button("2"));

        jPanel3.add(new Button("3"));
        jPanel3.add(new Button("3"));
        jPanel3.add(new Button("3"));
        jPanel3.add(new Button("3"));

        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("4"));



        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        container.add(jPanel4);

        this.setVisible(true);
        this.setBounds(100,100,500,340);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
