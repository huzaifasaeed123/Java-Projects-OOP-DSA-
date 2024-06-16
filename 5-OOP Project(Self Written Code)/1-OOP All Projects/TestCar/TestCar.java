
import java.util.Scanner;

public class TestCar
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Car c=new Car();
        c.printCarInfo();
        Car c2=new Car();
        c2.printCarInfo();
        
       /* c.setTankCaP(45.0);
        c.setFuelLev(30.0);
        c.setFuelE(12.0);*/
        Scanner input=new Scanner(System.in);
        int op1=1;
        do
        {
            System.out.println("1- To Add Fuel in Car\n2- To Drive a Car\n3- To Check Fuel Level");
            int op=input.nextInt();
            if(op==1)
            {
                double amt;
                System.out.println("Enter amount of fuel......");
                amt=input.nextDouble();
                c.addGas(amt);
            }
            else
            if(op==2)
            {
                double ds;
                System.out.print("Enter Distance........");
                ds=input.nextDouble();
                c.driveCar(ds);
            }
            else
            if(op==3)
            {
                System.out.println("Fuel Level "+ c.getFuelL());
            }
            System.out.println("Enter 1 to continue......");
            op1=input.nextInt();
        }while(op1==1);
        //c.addGas(20.0);
        //c.driveCar(100.0);
        //System.out.println("Car Details: "+c.getTankCap()+"  "+c.getFuelL()+"   "+c.getFuelE());


    }

}