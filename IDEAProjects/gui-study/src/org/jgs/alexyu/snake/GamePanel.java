package org.jgs.alexyu.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
/**
 * 1.定义数据
 * 2.画上去
 * 3.监听事件
 *      键盘
 *      事件
 */


/**
 * 游戏的面板
 * @author alex-ycp
 * @create 2021-06-19 16:08
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    // 定义蛇的数据结构
    int length ;// 蛇的长度
    int[] snakeX = new int[600]; // 蛇的坐标 25*25  因为一个格子是25px
    int[] snakeY = new int[500];
    String fx ;   // 当前蛇头方向
    int preKeyCode ;   // 上一步前蛇头方向

    // 定义成绩
    int score ;

    // s食物的坐标
    int foodx;
    int foody;
    Random random = new Random();

    // 游戏当前的状态:  开始  停止
    boolean isStart = false;  // 默认停止

    boolean isFail = false; //默认不失败  游戏状态
    // 定时器 以毫秒为单位
    Timer timer = new Timer(150,this); // 100ms执行一次

    public GamePanel() {
        init();
        // 获得焦点和键盘事件
        this.setFocusable(true);// 获得焦点事件
        this.addKeyListener(this);  //获得键盘监听事件
        timer.start();  // 一开始定时器就启动
    }

    // 初始化方法
    public void init(){
        length = 3;
        score = 0;

        snakeX[0] = 100;snakeY[0] = 100;  //脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100;
        snakeX[2] = 50;snakeY[2] = 100;
        fx = "R";  // 初始方向为右
        // 食物随机
        foodx = 25 + 25 * random.nextInt(30);
        foody = 75 + 25 * random.nextInt(20);
    }

    // 绘制面板 , 我们游戏中的所有东西都用这个画笔画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 清屏防止闪烁
        // 绘制静态面板
        this.setBackground(Color.white);
        Data.header.paintIcon(this,g,25,11);// 头部广告栏
        g.fillRect(25,75,850,600);//默认的游戏界面

        // 画积分
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑",Font.BOLD,24));
        g.drawString("分数:"+(length-3)*10,750,32);
        g.drawString("长度:"+(length-3),750,56);


        // 画食物
        Data.food.paintIcon(this,g,foodx,foody);
        // 把小蛇画上去
        switch (fx){
            case "R":
                Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            case "L":
                Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            case "U":
                Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            case "D":
                Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            default:
                break;
        }
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }


        // 游戏状态
        if (isStart==false){
            g.setColor(Color.white);
            // 设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        // 通关或者失败
        if (isFail){
            g.setColor(Color.RED);
            // 设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败,按下空格重新开始",300,300);
        }
    }

    // 键盘监听
    @Override
    public void keyPressed(KeyEvent e) {
        // 获得键盘的按键
        int keyCode = e.getKeyCode();
        // 小蛇移动
        switch (keyCode){
            case KeyEvent.VK_SPACE:
                if (isFail){
                    // 重新开始
                    isFail = false;
                    init();
                }else{
                    isStart = !isStart;// 取反
                    repaint();
                }
                break;
            case KeyEvent.VK_UP:
                if (preKeyCode == KeyEvent.VK_DOWN){
                    break;
                }
                fx = "U";
                preKeyCode = KeyEvent.VK_UP;
                break;
            case KeyEvent.VK_DOWN:
                if (preKeyCode == KeyEvent.VK_UP){
                    break;
                }
                fx = "D";
                preKeyCode = KeyEvent.VK_DOWN;
                break;
            case KeyEvent.VK_LEFT:
                if (preKeyCode == KeyEvent.VK_RIGHT){
                    break;
                }
                fx = "L";
                preKeyCode = KeyEvent.VK_LEFT;
                break;
            case KeyEvent.VK_RIGHT:
                if (preKeyCode == KeyEvent.VK_LEFT){
                    break;
                }
                fx = "R";
                preKeyCode = KeyEvent.VK_RIGHT;
                break;
            default:
                break;
        }

    }

    // 事件监听----- 需要通过固定事件来刷新
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && isFail == false){ //如果游戏是开始状态,就让小蛇动起来

            // 吃食物
            if (snakeX[0] == foodx && snakeY[0] == foody){
                length ++ ;
                // 再次随机食物
                foodx = 25 + 25* random.nextInt(34);
                foody = 75 + 25* random.nextInt(24);
            }

            // 移动
            for (int i = length-1; i >0 ; i--) {  //后一节移到前一节位置
                snakeX[i] = snakeX[i-1];  //向前一截
                snakeY[i] = snakeY[i-1];  //向前一截
            }

            // 走向
            switch (fx){
                case "R":
                    snakeX[0] = snakeX[0] + 25; //头动   这一句与for的顺序不能变,先身体动头在动
                    // 边界判断
                    if (snakeX[0] > 850) {
                        snakeX[0] = 25;
                    }
                    break;
                case "L":
                    snakeX[0] = snakeX[0] - 25; //左移
                    // 边界判断
                    if (snakeX[0] < 25) {
                        snakeX[0] = 850;
                    }
                    break;
                case "U":
                    snakeY[0] = snakeY[0] - 25; //上移
                    // 边界判断
                    if (snakeY[0] < 75) {
                        snakeY[0] = 650;
                    }
                    break;
                case "D":
                    snakeY[0] = snakeY[0] + 25; //下移
                    // 边界判断
                    if (snakeY[0] > 650) {
                        snakeY[0] = 75;
                    }
                    break;
                default:
                    break;
            }
            //失败判断,撞到自己就算失败
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i]&&snakeY[0] == snakeY[i]){
                    isFail = true;
                }
            }

            repaint(); //重画页面
        }
        timer.start();  //定时器开启
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
