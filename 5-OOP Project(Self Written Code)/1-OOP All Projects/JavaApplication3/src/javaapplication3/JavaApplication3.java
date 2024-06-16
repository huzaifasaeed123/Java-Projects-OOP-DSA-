/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author saeed
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String line="";
        String mcqs[]=new String[10];
       try {
            Scanner reader = new Scanner(new FileReader("abc.txt"));
            //    System.out.println(line);


            while (reader.hasNext()) {
                if(line.contains("Q:"))
                {
                    String [] arr= line.split("Q:");
                    line=arr[1];
//                    mcqs[0]=arr[1];
//                    mcqs[4]=arr[1];


                }
                if(line.contains("A:"))
                {
                    String [] arr= line.split("A:");
                    line=arr[1];
                    mcqs[0]=arr[0];


                }
                if(line.contains("B:"))
                {
                    String [] arr= line.split("B:");
                    line=arr[1];
                    mcqs[1]=arr[0];


                }
                if(line.contains("C:"))
                {
                    String [] arr= line.split("C:");
                    line=arr[1];
                    mcqs[2]=arr[0];


                }
                if(line.contains("D:"))
                {
                    String [] arr= line.split("D:");
                    line=arr[1];
                    mcqs[3]=arr[0];
                    mcqs[4]=arr[1];


                }
                
                line = line+reader.nextLine();
                //System.out.println(line);
            }
            for(int i=0;i<5;i++)
            {
                System.out.println(mcqs[i]);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        
    }
}

//        String str="";
//        String str2="";
//        File file=new File("abc.txt");
//        Scanner scan=new Scanner(file);
//       
//        while(scan.hasNext())
//        {
//           str2= scan.findInLine("Q:)");
//             str=str+scan.next();
//
//        }
//                             System.out.println(str);
//                             System.out.println(str2);

    
    

