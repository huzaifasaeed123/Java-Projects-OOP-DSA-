/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageme_system;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author saeed
 */
public class CheckBox_Event_Handling implements ItemListener{
    Frame F = new Frame();
    @Override
    public void itemStateChanged(ItemEvent e) {
        for (int i = 0; i < Frame.cb.length ; i++) {
            if(Frame.cb[i].isSelected())
            {
                Frame.tf[i].enable();
            }
            else{
                Frame.tf[i].setText("");
                Frame.tf[i].disable();
            }
        }
    }
}
