package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q5 {

    public static void main(String[] args) {
        copy();
    }

    public static void copy() {
        FileReader fr = null;
        try {
            File f = new File("data.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                FileWriter fw = new FileWriter("copy.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(line);
                bw.newLine();
                bw.close();
                fw.close();
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
}
