package org.jgs.alexyu.gui05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author alex-ycp
 * @create 2021-06-18 20:24
 */
public class JButton01 extends JFrame {

    public JButton01() {
        Container container = this.getContentPane();
        URL url = JButton01.class.getResource("kafei.jpg");
        ImageIcon icon = new ImageIcon(url);
        JButton button = new JButton(icon);

        button.setToolTipText("咖啡");

        container.add(button);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,560,450);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new JButton01();
    }
}
