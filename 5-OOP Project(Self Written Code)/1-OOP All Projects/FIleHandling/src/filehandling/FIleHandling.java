
package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JCheckBox;
public class FIleHandling {
    public static void main(String[] args) 
    {
        JCheckBox [] ab=new JCheckBox[2];
        ab[0]=new JCheckBox();
        ab[0].setText("ere");
        System.out.println(ab[0].getText());
       File f1=new File("abc");
       try{
                   FileWriter write1=new FileWriter("abc1");
                   write1.write("rtyuiokldsmfnbdnsmfd");
          }
       catch (IOException e)
       {
           
       }
        
    }
    
}
