/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccount;

/**
 *
 * @author fa21-bcs-020
 */
public class Date {
    private int x,y,z;

    public Date(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    @Override
    public String toString()
    {
        return String.format("%d/%d/%d", x,y,z);
    }
    
    
}
