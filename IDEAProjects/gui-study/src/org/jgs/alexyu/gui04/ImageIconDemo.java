package org.jgs.alexyu.gui04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author alex-ycp
 * @create 2021-06-18 19:30
 */
public class ImageIconDemo extends JFrame{

    public ImageIconDemo(){
        // 获取图片地址
        JLabel label = new JLabel("ImageIcon");
        //getResource路径是src目录下
        URL url = ImageIconDemo.class.getResource("source/xjj.jpg");
        System.out.println(url);


        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
