
package lab1;

/**
 *
 * @author fa21-bcs-020
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a =53846,b;
        for(int i=1;i<6;i++)
        {
            b=a%10;
          a=a/10;
           System.out.print(b);
            
        }
    }
    
}
