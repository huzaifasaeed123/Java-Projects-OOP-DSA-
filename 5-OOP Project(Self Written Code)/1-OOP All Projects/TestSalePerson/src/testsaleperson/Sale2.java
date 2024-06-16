/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsaleperson;

/**
 *
 * @author saeed
 */
public class Sale2 {
    private String day;
    private int[][] arr;

    public Sale2(String day, int[][] arr) {
        this.day = day;
        this.arr = arr;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }
    public  void printarray()
    {
        System.out.printf("%s",this.day);
        int sum=0;
        System.out.printf("             Person 1    Person 2    Person 3    Person 4    Person 5    Total\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("\nProduct %d",i+1);
            for(int j=0;j<arr[i].length;j++)
                
                {
                 System.out.printf("%10d ",arr[i][j]);
                 sum= sum+arr[i][j];
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
               
               sum= sum+arr[j][i];
               
           }
           System.out.printf("%11d", sum);
           sum=0;
        }
        System.out.println();
    }
    
    
}
