package org.jgs.test;

/**
 * 多线程创建: 方式一: 继承Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类run()  -->将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 * 例子: 遍历100以内的所有偶数
 *
 * @author alex-ycp
 * @create 2021-05-31 16:34
 */

// 1.创建一个继承与Thread类的子类

class MyThread extends Thread{
    //2. 重写Thread类run()

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3. 创建Thread类的子类的对象
        MyThread myThread = new MyThread();

        //4.通过此对象调用start()
        myThread.start();
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }

        Thread maint = Thread.currentThread();
        System.out.println(maint.getName()+"结束");
    }
}
