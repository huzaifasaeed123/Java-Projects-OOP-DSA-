
package testsaleperson;
import java.util.Random;
/**
 *
 * @author saeed
 */
public class TestSalePerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] a=new int[5][5];
        int [][] b=new int[5][5];
        Sale2 []cd=new Sale2[5];
        cd[0]=new Sale2("Day 1",a);
        cd[1]=new Sale2("Day 2",b);
        cd[0].printarray();
        Sale c=new Sale(a,b);
        //c.selectRandomArray();
        //c.selectRandomArray();
        //c.printarray();
       
       //printarray(a);
       //printarray(b);
    }
    public static void printarray(int [][] a)
    {
        
        int sum=0;
        System.out.printf("             Person 1    Person 2    Person 3    Person 4    Person 5    Total\n");
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("\nProduct %d",i+1);
            for(int j=0;j<a[i].length;j++)
                
                {
                 System.out.printf("%10d ",a[i][j]);
                 sum= sum+a[i][j];
                 }
            System.out.printf("%10d\n",sum);
            sum=0;
        }
        System.out.println();
        System.out.printf("TOTAL(Per)");
        for (int i=0;i<5;i++)
        {
           for (int j=0;j<5;j++)
           {
               
               sum= sum+a[j][i];
               
           }
           System.out.printf("%11d", sum);
           sum=0;
        }
        System.out.println();
    }
    public static void selectRandomArray(int[][] a)
    {
        Random r=new Random();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                {
                 a[i][j]=r.nextInt(100);
                 }
        }
    }
}
