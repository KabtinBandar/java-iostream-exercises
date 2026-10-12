package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q3 {

    public static void main(String[] args) {
        try {
            System.out.println("average = " + Math.round(average()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 

    public static double average() throws FileNotFoundException, IOException {
        double sum = 0.0;
        int count = 0;
        File f = new File("profit.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            sum = sum + Integer.parseInt(line);
            count++;
        }

        br.close();
        fr.close();

        return sum / count;

    }
}
