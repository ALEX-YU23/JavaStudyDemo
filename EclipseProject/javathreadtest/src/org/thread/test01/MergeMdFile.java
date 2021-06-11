package org.thread.test01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 实现多个小文件合并的类
 */

public class MergeMdFile {
    public static void main(String[] args) throws IOException {
        //1.给定源路径文件夹
        String sourceDir = "D:\\Java21111\\LearNote\\myNote\\01类与对象";
        String outfilePath = sourceDir + "\\01类与对象汇总.md";

        //2.获取该文件夹下的所有文件(不递归)
        List<File> fileList = getFileList(new File(sourceDir));

        //3.按照文件名称进行升序
        fileList.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //4.遍历每个小文件并写入目标文件
        BufferedWriter bw = new BufferedWriter(new FileWriter(outfilePath, true));
        for (File file : fileList) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            br.close();
        }

        System.out.println("合并完成");
        bw.close();
    }


    //实现文件夹中的文件遍历
    public static List<File> getFileList(File file) throws IOException {
        List<File> list = new ArrayList<File>();//存放所有的文件对象的结果集合

        File[] files = file.listFiles();
        for (File file1 : files) {
            String file1Name = file1.getName();
            //定义一个正则
            Pattern p = Pattern.compile("^\\d.+\\.md$");
            Matcher m = p.matcher(file1Name);
            //如果子文件是文件并且名称符合正则 01....md这个结构(以两位数字开头,以.md结尾),就加入队列
            if (file1.isFile() && m.find()) {
                list.add(file1);
                // System.out.println(file1Name);
            }
        }

        return list;

    }
}


