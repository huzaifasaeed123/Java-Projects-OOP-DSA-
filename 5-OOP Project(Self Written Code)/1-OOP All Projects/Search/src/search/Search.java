/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search;

/**
 *
 * @author saeed
 */
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={2,3,4,5,6,7};
        //LinearSearch(6, arr);
        System.out.println(BinarySearch(6, arr));
        
    }
    public static int LinearSearch(int key,int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
            {
                return i;
                
            }
           
            
        }
        return -1;
    }
    public static int BinarySearch(int key,int [] arr)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<end)
        {
            mid=(start+end)/2;
            if(key==arr[mid])
                return mid;
            else if(key>mid)
            {
                start=mid+1;
            }
            else
                end=mid-1;
        }
        
        return -1;
    }
    
}
