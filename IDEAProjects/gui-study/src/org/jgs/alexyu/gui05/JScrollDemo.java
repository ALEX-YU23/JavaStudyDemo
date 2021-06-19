package org.jgs.alexyu.gui05;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 20:09
 */
public class JScrollDemo extends JFrame {
    public JScrollDemo() {
        Container container = this.getContentPane();
        // 文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("华英学习");

        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,450,340);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }

}
