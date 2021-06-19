package org.jgs.alexyu.gui04;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 18:12
 */
public class TestJFrame02 {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}
class MyJFrame extends JFrame{
    public void init(){
        // 获得容器
        Container container = this.getContentPane();
        container.setBackground(new Color(23,122,211));

        // 设置文字JLabel
        JLabel label = new JLabel("欢迎来到狂神说java系列");
        add(label);

        // 让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        setBounds(100,100,440,220);
        setVisible(true);

    }
}