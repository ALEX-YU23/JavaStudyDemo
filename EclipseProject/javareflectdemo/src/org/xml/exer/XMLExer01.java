package org.xml.exer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

/**
 * 案例：解析web.xml文件，将根标签中所有名字
 * <mime-mapping>的标签获取到，并将该标签中的
 * 子标签<extension>中间的文本作为key，子标签
 * <mime-type>中的文本作为value存入名为mime-mapping
 * 的map集合中.
 * @author AlexYU
 * @date 2021年6月3日下午2:26:00
 */
public class XMLExer01 {

	public static void main(String[] args) throws SAXException {
		SAXReader sr = new SAXReader();
		FileInputStream fis = null;
		Document doc = null;
		try {
			fis = new FileInputStream("web.xml");
			doc = sr.read(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		//获取根节点
		Element rootEle = doc.getRootElement();
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		List<Element> elements = rootEle.elements("mime-mapping");
		for (Element element : elements) {
			List<Element> elements2 = element.elements();
			String extension = elements2.get(0).getText();
			String mime_type = elements2.get(1).getText();
//			System.out.println(extension+":"+mime_type);
			hashMap.put(extension, mime_type);
//			System.out.println();
		}
		System.out.println(hashMap.size());
		
	}
}
