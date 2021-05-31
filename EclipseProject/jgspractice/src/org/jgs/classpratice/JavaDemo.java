package org.jgs.classpratice;

public class JavaDemo {
    
    public static void main(String arg[]){
    	Book b1 = new Book("javascript", 10.90);
    	Book b2 = new Book("java", 156.2220);
    	Book b3 = new Book("typescript", 18.90);
    	System.out.println(b1.getInfo());
    	System.out.println(b2.getInfo());
    	System.out.println(b3.getInfo());
    	System.out.println(Book.getCount());
    }
}