
package assignment_1_dsa;


public class Assignment_1_DSA {

    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={0,20,134,331,342,425};
        int a=ArrayUtility.findMaximum(arr, 0, 5);
        int b=ArrayUtility.findMinimum(arr, 0, 5);
        int c=ArrayUtility.findMaximumPosition(arr, 0, 5);
        int d=ArrayUtility.findMinimumPosition(arr, 0, 5);
        
        System.out.println("Maxium Num="+a);
        System.out.println("Maximum Position="+c);
       System.out.println("Minmum Num="+b);
        System.out.println("Minimum Position="+d);
        
        //Swap At index of i and j
        ArrayUtility.swap(arr, 0, 5);
        System.out.println("After Swapping");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
