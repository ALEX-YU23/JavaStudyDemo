package org.jgs.alexyu.gui06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * 下拉框
 * 一般是动态扩容的
 *
 * @author alex-ycp
 * @create 2021-06-18 21:26
 */
public class TestCommonBoxDemo02 extends JFrame {
    public TestCommonBoxDemo02() {
        Container container = this.getContentPane();

        // 生成列表的内容
//        String[] contents = {"1","2","3"};

        Vector contents = new Vector();

        // 列表中需要放内容
        JList jList = new JList(contents);
        contents.add("张三");
        contents.add("lisi");
        contents.add("wangwu");

        container.add(jList);


        this.setVisible(true);
        this.setBounds(100,100,400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestCommonBoxDemo02();
    }
}
