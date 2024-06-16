
package testtictac;
public class TestTicTac {
    public static void main(String[] args) {
        int [][] a=new int[3][3];
        TicTac ab=new TicTac(a);
        for(int l=0;l<9;l++)
        {
            ab.player1();
            ab.checkwin();
            ab.player2();
            ab.checkwin();
        }
        System.out.println("Match Draw hooo gya jnab");
        
    }
    
}
