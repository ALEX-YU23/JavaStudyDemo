package org.jgs.javaiotest02;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
重写writeStreamHeader（）方法
*/
class MyObjectOutputStream  extends ObjectOutputStream{

	// 构造方法
    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    // 不写头
    @Override
    public void writeStreamHeader() throws IOException{
    	System.out.println("子类覆写");
        return;
    }
}
