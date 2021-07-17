package org.jgs.alexyu.gui06;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 21:26
 */
public class TestCommonBoxDemo01 extends JFrame {
    public TestCommonBoxDemo01() {
        Container container = this.getContentPane();

        JComboBox status = new JComboBox();
        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);


        this.setVisible(true);
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestCommonBoxDemo01();
    }
}
