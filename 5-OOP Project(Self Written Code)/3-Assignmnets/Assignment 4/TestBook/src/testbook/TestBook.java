/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbook;

/**
 *
 * @author saeed
 */
public class TestBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrintBook a=new PrintBook("Huzaifa","dDF123","The warrirs","Huzaifa",2021);
        AudioBook b=new AudioBook(23456,200,"The warrirs","Huzaifa",2021);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    
}
