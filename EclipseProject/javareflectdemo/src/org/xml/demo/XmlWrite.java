package org.xml.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.reflect.exer.Dog;

public class XmlWrite {
	
	// 将对象写到xml中
	public static void xmlWrite(ArrayList<Dog> list){
		// 创建一个xml文件对象
		Document doc = DocumentHelper.createDocument();
		
		// 创建根节点
		Element root = doc.addElement("dogs");
		
		for (Dog dog : list) {
			Element dEle = root.addElement("dog");// 子节点
			
			dEle.addElement("name").addText(dog.getName());
			dEle.addElement("sex").addText(dog.getSex()+"");
			dEle.addElement("health").addText(dog.getHealth()+"");
			dEle.addElement("love").addText(dog.getLove()+"");
			dEle.addElement("strain").addText(dog.getStrain()+"");
			
			
		}
		OutputFormat format = OutputFormat.createPrettyPrint();//用于格式化xml内容和设置头部标签
		
		format.setEncoding("utf-8");

		FileWriter out;//创建一个输出流

        try {

            out = new FileWriter("dog2.xml");

            XMLWriter writer = new XMLWriter(out,format);

            writer.write(doc);

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

	// 从xml文件中读取对象
	public static ArrayList<Dog> readObjFXml() {
		// 创建Saxreader
		SAXReader sr = new SAXReader();
		// 读取xml文件,生成dom树
		Document doc = null;
		try {
			doc = sr.read(new FileInputStream("Dogs.xml"));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
		// 通过文档对象解析xml 获取节点 拿到节点值
		Element root = doc.getRootElement(); // 获取根节点
		// 对象表
		ArrayList<Dog> doglists = new ArrayList<>();
		// 获取根节点下所有子节点
		List<Element> elements = root.elements();
		for (Element ele1 : elements) {
			String name = ele1.elementText("name");
			char sex = ele1.elementText("sex").charAt(0);

			int health = Integer.parseInt(ele1.elementText("health"));
			int love = Integer.parseInt(ele1.elementText("love"));
			String strain = ele1.elementText("strain");

			Dog dog = new Dog(name, sex, health, love, strain);
			doglists.add(dog);
		}
		return doglists;
	}

	public static void main(String[] args) {
		ArrayList<Dog> readObjFXml = readObjFXml();
		xmlWrite(readObjFXml);
	}

}
