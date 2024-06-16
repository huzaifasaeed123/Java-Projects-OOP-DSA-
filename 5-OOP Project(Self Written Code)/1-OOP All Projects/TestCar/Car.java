
public class Car
{
    private double fuelEff;
    private double tankCap;
    private double fuelLev;
    /*public Car()
    {
        this.tankCap=40.0;
        this.fuelEff=13.0;
        this.fuelLev=15.0;
    }*/
    public void printCarInfo()
    {
        System.out.println("Fuel Cap "+this.tankCap);
        System.out.println("Fuel Levl "+this.fuelLev);
        System.out.println("Fuel Eff "+this.fuelEff);
    }
    public void setFuelE(double f)
    {
        this.fuelEff=f;
    }
    public void setTankCaP(double c)
    {
        this.tankCap=c;
    }
    public void setFuelLev(double lv)
    {
        if(lv>this.tankCap)
        {
            System.out.println("Invalid Fuel Level");
            this.fuelLev=0.0;
        }
        else
        {
            this.fuelLev=lv;
        }
    }
    public double getFuelL()
    {
        return this.fuelLev;
    }
    public double getTankCap()
    {
        return this.tankCap;
    }
    public double getFuelE()
    {
        return this.fuelEff;
    }
    public void addGas(double val)
    {
        if(this.fuelLev+val>this.tankCap)
        {
            System.out.println("Unable to add Gas");
        }
        else
        {
            System.out.println("Gas Added " + val);
            this.fuelLev=this.fuelLev+val;
            System.out.println("Current Fuel Level: "+this.fuelLev);
        }
    }

    public void driveCar(double dist)
    {
        double gc=dist/this.fuelEff;
        if(this.fuelLev>=gc)
        {
            System.out.println("You can travel");
            this.fuelLev=this.fuelLev-gc;
            System.out.println("Current Fuel Level: "+this.fuelLev);
        }
        else
        {
            System.out.println("Unable to Travel");
        }
    }

}
