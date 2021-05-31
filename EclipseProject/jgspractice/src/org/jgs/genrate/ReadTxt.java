package org.jgs.genrate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadTxt {

	public static String [] readTxtFile(String filePath){
		String lineTxt[] = new String [50];
		try {
                String encoding="UTF-8";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    
                    int i = 0;
                    while(i<lineTxt.length){
                    	lineTxt[i] = bufferedReader.readLine();
                    	System.out.println((i+1)+"、"+lineTxt[i]);
                        i ++ ;
                    }
                    
                    read.close();
                    
        }else{
            System.out.println("找不到指定的文件");
        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
		return lineTxt;
     
    }
     
    public static void main(String argv[]){
        String filePath = "E:\\out.txt";
//      "res/";
        readTxtFile(filePath);
    } 
	
}
