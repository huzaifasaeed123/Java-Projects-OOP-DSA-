/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern;

/**
 *
 * @author saeed
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for(int i=0;i<4;i++)
//        {
//            for (int j = 0; j < 5; j++) 
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        // Hollow Rantangle
//        for(int i=0;i<4;i++)
//        {
//            for (int j = 0; j < 5; j++) 
//            {
//                if(i==0 || i==3 || j==0 || j==4)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println("");
//        }
        // TriANGLE
//          for(int i=0;i<4;i++)
//        {
//            for (int j = 0; j <= i; j++) 
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        // Reverse Triangle
//        for(int i=3;i>=0;i--)
//        {
//            for (int j = 0; j <= i; j++) 
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

       //Inverted triangle 180 reverse original
//        for (int i = 0; i <= 4; i++) 
//        {
//            for (int j = 4; j > i; j--) 
//            {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) 
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//printnumberpattern();
//ButterflyPatteren();
//SolidRhombus();
//HollowRhombus();
//diamond();
//Halfdiamondnumber();
//PalindromicNumberPattern();
           PracticeArray obj1=new PracticeArray();
           int arr[]={-5,2,3,4,50,-6,7};
           //obj1.ReverseArray(arr);
           //obj1.PairArray(arr);
           obj1.SubArray(arr);
    }
    
    public static void printnumberpattern()
    {
        
        //Triangle
//        for (int i = 1; i < 5; i++) 
//        {
//            for (int j = 1; j <=i; j++) 
//            {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
        // Reverse Triangle
//        for (int i = 0; i < 5; i++) 
//        {
//            for (int j = 1; j <=5-i; j++) 
//            {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
//        int sum=1;
//        for (int i = 1; i < 6; i++) 
//        {
//            for (int j = 1; j <=i; j++) 
//            {
//                System.out.print(sum++ + " ");
//            }
//            System.out.println("");
//        }
        
        
//        for (int i = 1; i < 6; i++) 
//        {
//            for (int j = 1; j <=i; j++) 
//            {
//                if((i+j)%2==0)
//                System.out.print("1");
//                else
//                    System.out.print("0");
//            }
//            System.out.println("");
//        }
        
//1
//01
//101
//0101
//10101
//        char ch='A';
//        for (int i = 1; i < 6; i++) 
//        {
//            for (int j = 1; j <=i; j++) 
//            {
//                System.out.print(ch++ + " ");
//            }
//            System.out.println("");
//        }
//        
//A 
//B C 
//D E F 
//G H I J 
//K L M N O 
        
        
    }
    public static void ButterflyPatteren()
    {
        // ButterflyPatteren
//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *        
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <=i; j++) 
            {
                System.out.print("*");
               
            }
//            for (int j = i*2; j <=7; j++) 
//            {
//                System.out.print(" ");
//                
//            }// alternate logic 
            for (int j = 1; j<=2*(4-i); j++) 
            {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        for (int i = 4; i >= 1; i--) 
        {
            for (int j = 1; j <=i; j++) 
            {
                System.out.print("*");
               
            }
//            for (int j = i*2; j <=7; j++) 
//            {
//                System.out.print(" ");
//                
//            }// alternate logic 
            for (int j = 1; j<=2*(4-i); j++) 
            {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }

    private static void SolidRhombus() {
        
//    *****
//   *****
//  *****
// *****
//*****        
        for (int i = 1; i <= 5; i++) {
//            for (int j = i; j <= 4; j++) 
//            {
//                System.out.print(" ");
//            }
            //alternative logic for spaces
            for (int j = 1; j <= 5-i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private static void HollowRhombus() {
        
//    *****
//   *   *
//  *   *
// *   *
//*****     
        for (int i = 1; i <= 5; i++) {
//            for (int j = i; j <= 4; j++) 
//            {
//                System.out.print(" ");
//            }
            //alternative logic for spaces
            for (int j = 1; j <= 5-i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) 
            {
                if(j==1 || j==5 || i==1 || i==5)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void diamond()
    {
//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *        
        int n=4;
        // 1st half
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //2nd half
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void Halfdiamondnumber()
    {
//   1 
//  2 2 
// 3 3 3 
//4 4 4 4        
        int n=5;
        // 1st half
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
      
    }
    public static void PalindromicNumberPattern()
    {
//    1
//   212
//  32123
// 4321234
//543212345        
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
