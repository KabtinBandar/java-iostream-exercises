package io;

import java.io.File;

public class Q1 {

    public static void main(String[] args) {
               System.out.println(sizeInByte() + " Byte");
               System.out.println(sizeInKB()+ " KB");
               System.out.println(sizeInMB()+ " MB");
    }

    public static double sizeInByte() {
        File f  = new File("test.txt");
        return f.length();
    }
    
    public static double sizeInKB() {
        File f  = new File("test.txt");
        return f.length()/1024.0;
    }
    public static double sizeInMB() {
        File f  = new File("test.txt");
        return f.length() / (1024.0*1024.0);
    }
}
