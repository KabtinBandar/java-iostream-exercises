package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q2 {

    public static void main(String[] args) {

        FileReader fr = null;
        try {
            File f = new File("date .txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            br.close();
            fr.close();
            String[] arr = line.split("/");
            int day = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int year = Integer.parseInt(arr[2]);
            int age = 2024 - year;
            System.out.println("age = " + age);
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
}
