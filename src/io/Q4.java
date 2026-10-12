package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        read();
        System.out.println("deg : " + list);
        System.out.println("max : " + maxdegree());
        System.out.println("min : " + mindegree());
        System.out.println("pas : " + numberOfPassed());
    }

    public static void read() {
        FileReader fr = null;
        try {
            File f = new File("degrees.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public static int maxdegree() {
        return Collections.max(list);
    }

    public static int mindegree() {
        return Collections.min(list);
    }

    public static int numberOfPassed() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int degree = list.get(i);
            if (degree >= 50) {
                count++;
            }
        }
        return count;
    }

}
