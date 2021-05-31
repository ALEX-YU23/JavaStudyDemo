package org.jgs.javafiletest01;

import java.io.File;
import java.io.FileFilter;

import org.junit.Test;

// 用拉姆达表达式
public class FileExerDemo01 {

	@Test
	public void tets1() {
		File file = new File("./");
		String fs = ".";
		File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				String name = pathname.getName();
				return name.startsWith(fs);
			}
		});
		for (File f : listFiles) {
			System.out.println(f.getName());
		}
	}
	
	@Test
	public void tets2() {
		File file = new File("./");
		File[] listFiles = file.listFiles(f->f.getName().startsWith("."));
		
		for (File f : listFiles) {
			System.out.println(f.getName());
		}
	}
}
