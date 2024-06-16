

package testcandycrush;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventCandyCrush extends CandyCrush implements MouseListener
{
    public static int k=3;
    public static int  press=1;
    public static int i1,j1,i2,j2;

    @Override
    public void mouseClicked(MouseEvent e) 
    {
       // check();
        if(press==1)
        {
           
            
                for (int i = 0; i < 10; i++) 
                {
                    for (int j = 0; j < 10; j++) 
                    {
                        if(label[i][j]==e.getSource())
                        {
                            i1=i;
                            j1=j;
//                           System.out.println("press 1   " + k);
//                            k++;
                            //System.out.println(i1);
                            //System.out.println(j1);
                            
                        }
                    }
                }
            //System.out.println("press 1   " + k);
                 press=2;
            //    k++;
            
        }
        else if(press==2)
        {
            
            press=1; 
            
                for (int i = 0; i < 10; i++) 
                {
                    for (int j = 0; j < 10; j++) 
                    {
                        if(label[i][j]==e.getSource())
                        {
                            int x=label[i1][j1].getLocation().x;
                            int y=label[i1][j1].getLocation().y;
                            int x1=label[i][j].getLocation().x;
                            int y1=label[i][j].getLocation().y;
                            if(((x+50)==x1 && y==y1) ||((x-50)==x1 && y==y1) || ((y+50)==y1 && x==x1) || ((y-50)==y1 && x==x1) )
                            {
                            String temp,val1,val2;
                            val1=label[i][j].getText();
                            val2=label[i1][j1].getText();
                            temp=val1;
                            val1=val2;
                            val2=temp;
                            label[i][j].setText(val1);
                            label[i1][j1].setText(val2);
                           color();
                           check();
                            
                            }
                        }
                    }
                }
                String str1= String.valueOf(score);
                txt1.setText(str1);
                System.out.printf("%s",str1);
                System.out.println("abcsd");
        }
        
       
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       }

    @Override
    public void mouseReleased(MouseEvent e) {
      }

    @Override
    public void mouseEntered(MouseEvent e) {
     }

    @Override
    public void mouseExited(MouseEvent e) {
     }
    
}

