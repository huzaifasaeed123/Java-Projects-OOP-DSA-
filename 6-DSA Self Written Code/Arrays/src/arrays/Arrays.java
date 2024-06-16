
package arrays;
import java.util.Scanner;
/**
 *
 * @author saeed
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={4,5,7}; //initilize and declare array without specific size
        Scanner input=new Scanner(System.in);
        final int abc;
        abc= input.nextInt();
        int [] b=new int[abc];
        printArray(a);
        for(int z=0;z<b.length;z++){
            System.out.println(b[z]);
        }
    }

    private static void printArray(int[] a) {
        
        for(int i:a)
        {
            a[i]=3;
            System.out.println(a[i]);
            
        }
        System.out.println("========================");
       }
    
}
