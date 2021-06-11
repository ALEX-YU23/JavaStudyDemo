package org.xml.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.reflect.exer.Dog;

/*
 * 使用dom4j解析xml文档
	1.导包dom4qjar
	2.创建SAXReader对象
	3.获取文档的dom树
	4.通过相关方法获取每个子节点及其内容

 */
public class XmlTest {

	@Test
	public void test01() { // 解析xml
		//创建Saxreader
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
		// 获取根节点下所有子节点
		List<Element> elements = root.elements();
		for (Element ele1 : elements) {
			List<Element> elements2 = ele1.elements();
			for (Element ele2 : elements2) {
				System.out.println(ele2.getName()+":"+ele2.getText());
			}
			System.out.println("***************");
		}
	}
	
	@Test
	public void test02() { // 解析xml 获取文本内容
		//创建Saxreader
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
		// 获取根节点下所有子节点
		List<Element> elements = root.elements();
		for (Element ele1 : elements) {
			// element <dog> ->  <name>
//			Element nameE = ele1.element("name");
//			String name = nameE.getText();
			String name = ele1.elementText("name");
			
			//Element sexE = ele1.element("sex");
			//char sex = sexE.getText().charAt(0);
			char sex = ele1.elementText("sex").charAt(0);

			//Element healthE = ele1.element("health");
			//int health = Integer.parseInt(healthE.getText());
			int health = Integer.parseInt(ele1.elementText("health"));

			//Element loveE = ele1.element("love");
			//int love = Integer.parseInt(loveE.getText());
			int love = Integer.parseInt(ele1.elementText("love"));

			//Element strainE = ele1.element("strain");
			//String strain = strainE.getText();
			String strain = ele1.elementText("strain");
			
			
			// 
			Dog dog = new Dog(name, sex, health, love, strain);
			System.out.println(dog);
		}
	}
	
	@Test
	public void test03() { // 解析xml 获取属性
		//创建Saxreader
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
		// 获取根节点下所有子节点
		List<Element> elements = root.elements();
		for (Element ele1 : elements) {
			Attribute attribute = ele1.attribute("id");
			String value = attribute.getValue();
			System.out.println(value);
		}
	}
}
