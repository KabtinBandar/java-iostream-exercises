
package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Q6 {
    
    public static void main(String[] args) {
        employee();
        
    }
    
    public static void employee(){
        int count  = 0 ;
     FileReader fr = null;
        try {
            File f = new File("salary.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                  int salary = Integer.parseInt(line);
                  if (salary < 3500){
                      count++;
                      System.out.println("salary :" +salary + " update : " + (3500-salary));
                  }
            }
            System.out.println("Employees : " + count);
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
