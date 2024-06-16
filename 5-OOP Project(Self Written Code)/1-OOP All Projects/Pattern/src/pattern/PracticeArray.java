/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author saeed
 */
public class PracticeArray{
    
    public void ReverseArray(int [] arr)
    {
        
       int end=arr.length-1;
        for (int i =0 ; i<=end/2; i++) 
        {
            int swap=arr[i];
            arr[i]=arr[end-i];
            arr[end-i]=swap;
            
        }
        for (int i = 0; i <= end; i++) 
        {
            System.out.println(arr[i]);
        }
    }
    public void PairArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println("");
        }
    }
    public void SubArray(int[] arr)
    {
        int sum=0;
        int sum2=0;
        int max=0;
        int [] prefix=new int[arr.length];
          prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            prefix[i]=arr[i]+prefix[i-1];
            
        }
        for (int i = 0; i < arr.length; i++) 
        {
            
            for (int j = i; j < arr.length; j++) 
            {
                sum=0;
                
                if(i==0)
                    sum=prefix[j];
                else
                {
                    sum=prefix[j]-prefix[i-1];
                }
                //Alternative Method
//                for (int k = i; k <= j; k++) 
//                {
//                    
//                    System.out.print(arr[k]+"  ");
//                    sum=sum+arr[k];
//                }
                if(sum>max)
                {
                    max=sum;
                }
                System.out.println("");
            }            
        }
        System.out.println("Greatest Maxium of SubArray="+max);
    }
    
    
}
