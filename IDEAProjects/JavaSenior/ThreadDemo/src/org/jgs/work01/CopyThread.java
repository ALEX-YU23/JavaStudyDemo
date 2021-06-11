package org.jgs.work01;

import java.io.*;

/**
 * 自定义文件对拷线程
 * @author alex-ycp
 * @create 2021-05-31 17:02
 */

public class CopyThread implements Runnable{
    @Override
    public void run() {
        String path = "hello.txt";
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("创建成功");
    }
}
