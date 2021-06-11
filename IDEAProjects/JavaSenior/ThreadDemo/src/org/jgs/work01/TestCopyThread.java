package org.jgs.work01;

/**
 * @author alex-ycp
 * @create 2021-05-31 17:09
 */
public class TestCopyThread {
    public static void main(String[] args) {
        CopyThread copyRun = new CopyThread();
        Thread copyThread = new Thread(copyRun);
        copyThread.start();
    }
}
