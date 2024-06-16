/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayslist;
import java.util.ArrayList;
/**
 *
 * @author saeed
 */
public class ArraysList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Integer> ab=new ArrayList<>();
        ab.add(89);
        ab.add(78);
        ab.add(43);
        System.out.println(ab.size());
        System.out.println(ab.get(1));
        ab.remove(1);
        ab.add(1,453);
        System.out.println(ab.get(1));
        System.out.println(ab.contains(89));
    }
    
}
