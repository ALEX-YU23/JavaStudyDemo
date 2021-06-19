package org.jgs.alexyu.gui03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 测试键盘监听事件
 * @author alex-ycp
 * @create 2021-06-18 15:08
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(100,100,400,300);
        setBackground(Color.blue);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获得键盘按下的键是哪一个
                int keyCode = e.getKeyCode();// 获取对应键的16进制常量
                System.out.println(keyCode);
                if (keyCode==KeyEvent.VK_UP){
                    System.out.println("上");
                }
            }
        });
    }





}

