package org.jgs.alexyu.gui04;

import javax.swing.*;
import java.awt.*;

/**
 * @author alex-ycp
 * @create 2021-06-18 19:17
 */
// 图标,需要实现类, Frame继承
public class IconDemo extends JFrame implements Icon {

    private int width;
    private int height;

    public IconDemo(){
    }

    public IconDemo(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void init(){
        IconDemo iconDemo = new IconDemo(15, 14);
        // 图标放在标签,也可以放在按钮上!
        JLabel jLabel = new JLabel("icontest",iconDemo,SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(jLabel);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
