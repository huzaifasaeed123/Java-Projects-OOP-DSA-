
package testtictac;
import java.util.Scanner;
public class TicTac {
    private  int[][] a;
    Scanner input=new Scanner(System.in);
    public TicTac(int[][] ab)
    {
        this.setA(ab);
    }
    public void player1()
    {
        displayarray();
        System.out.println("1st Player's turn,Enter index with respect to a[i][j]");
        System.out.println("1st Enter Row Index i");
        int i= input.nextInt();
        System.out.println("Now Enter Column Index j");
        int j= input.nextInt();
        if(a[i][j] != 0)
        {
             System.out.println("Yar dehan sa khel ya already hooo chuka howa");
           
            player1();
        }
        else
        {
            a[i][j]=1;
        }
    }
    public void player2()
    {
        displayarray();
        System.out.println("2nd Player's turn,Enter index with respect to a[i][j]");
        System.out.println("pehla Enter Row Index i");
        int i= input.nextInt();
        System.out.println("Now Enter Column Index j");
        int j= input.nextInt();
        if(this.a[i][j] != 0)
        {
            System.out.println("Yar dehan sa khel ya already hooo chuka howa");
            player2();
        }
        else
        {
            this.a[i][j]=2;
        }
    }
    public void checkwin()
    {
        if(this.a[0][0]==1 && this.a[0][1]==1 && this.a[0][2]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[1][0]==1 && this.a[1][1]==1 && this.a[1][2]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[2][0]==1 && this.a[2][1]==1 && this.a[2][2]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[0][0]==1 && this.a[1][0]==1 && this.a[2][0]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[0][1]==1 && this.a[1][1]==1 && this.a[2][1]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[0][2]==1 && this.a[1][2]==1 && this.a[2][2]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[0][0]==1 && this.a[1][1]==1 && this.a[2][2]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        else if(this.a[2][0]==1 && this.a[1][1]==1 && this.a[0][2]==1){System.out.println("Player 1 Is win"); System.exit(0);}
        
        else if(this.a[0][0]==2 && this.a[0][1]==2 && this.a[0][2]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[1][0]==2 && this.a[1][1]==2 && this.a[1][2]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[2][0]==2 && this.a[2][1]==2 && this.a[2][2]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[0][0]==2 && this.a[1][0]==2 && this.a[2][0]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[0][1]==2 && this.a[1][1]==2 && this.a[2][1]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[0][2]==2 && this.a[1][2]==2 && this.a[2][2]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[0][0]==2 && this.a[1][1]==2 && this.a[2][2]==2){System.out.println("Player 2 Is win"); System.exit(0);}
        else if(this.a[2][0]==2 && this.a[1][1]==2 && this.a[0][2]==2){System.out.println("Player 2 Is win"); System.exit(0);}
    }
    
    public void displayarray()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.printf("%d ",this.a[i][j]);
               
            }
            System.out.println();
            
        }
    }
            

    public int[][] getA() {
        return a;
    }

    public final void setA(int[][] a) {
        this.a = a;
    }
    
}
