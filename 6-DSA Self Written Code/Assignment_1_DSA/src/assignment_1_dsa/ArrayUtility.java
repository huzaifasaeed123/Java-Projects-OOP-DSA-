
package assignment_1_dsa;

import java.util.Arrays;
public class ArrayUtility 
{
     public static int findMaximum(int[] arr, int i, int j)
     {
         int max=Integer.MIN_VALUE;
         for(int a=i;a<=j;a++)
         {
             if(arr[a]>max)
                 max=arr[a];
             

         }
         return max;
     }
     public static int findMinimum(int[] arr, int i, int j)
     {
         int min=Integer.MAX_VALUE;
         for(int a=i;a<=j;a++)
         {
             if(arr[a]<min)
                 min=arr[a];
             
             
         }
         return min;
     }
     public static int findMaximumPosition(int[] arr, int i, int j)
     {
         int max=Integer.MIN_VALUE;
         int position=-1;
         for(int a=i;a<=j;a++)
         {
             if(arr[a]>max)
             {
                 max=arr[a];
                 position++;
             }
             

         }
          for (int k = i; k <= j; k++) {
             if(arr[k]==max)
             {
                 position=k;
             }
         }
      
         return position;
     }
     public static int findMinimumPosition(int[] arr, int i, int j)
     {
         int min=Integer.MAX_VALUE;
         int position=-1;
         for(int a=i;a<=j;a++)
         {
             if(arr[a]<min)
             {
                 min=arr[a];
             }
             
         }
         for (int k = i; k <= j; k++) {
             if(arr[k]==min)
             {
                 position=k;
             }
         }
      
         return position;
     }
     public static void swap(int[] arr, int i, int j)
     {
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         
     }


    
}
