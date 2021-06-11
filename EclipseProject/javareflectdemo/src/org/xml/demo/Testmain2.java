package org.xml.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.dom4j.*;
import org.dom4j.io.*;

public class Testmain2 {

    public static void main(String[] args){

        Document doc = DocumentHelper.createDocument();//创建一个xml文件对象

        Element root = doc.addElement("users");//创建根节点

        Element uEle = root.addElement("user");//创建子节点

        Element nameEle = uEle.addElement("name");//创建二级子节点

        nameEle.setText("张三");//为二级子节点添加文本内容

        OutputFormat format = OutputFormat.createCompactFormat();//用于格式化xml内容和设置头部标签

        format.setEncoding("utf-8");

        Writer out;//创建一个输出流

        try {

            out = new FileWriter("C:\\Users\\dj\\Desktop\\Users2.xml");

            XMLWriter writer = new XMLWriter(out,format);

            writer.write(doc);

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

