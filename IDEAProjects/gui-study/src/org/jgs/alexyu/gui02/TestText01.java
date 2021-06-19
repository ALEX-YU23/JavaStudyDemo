package org.jgs.alexyu.gui02;

import org.jgs.alexyu.guiutils.GUIUtile;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author alex-ycp
 * @create 2021-06-17 11:26
 */
public class TestText01 {
    public static void main(String[] args) {
        // 启动!
        new MyFrame();
    }

}
class MyFrame extends Frame{
    public  MyFrame(){
        TextField textField = new TextField();
        add(textField);
        // 监听这个文本框输入的文字
        MyTextMonitor myTextMonitor = new MyTextMonitor();

        // 按下回车就会触发输入框的事件
        textField.addActionListener(myTextMonitor);

        // 设置替换编码
        textField.setEchoChar('c');
        // 设置可见性
        setVisible(true);
        // 自适应
        pack();
        GUIUtile.windowClosing(this);
    }
}

class MyTextMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField)e.getSource();//获得一些资源
        System.out.println(field.getText());
        field.setText("");


    }
}