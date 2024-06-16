
package testemp7;

public class Engineer extends Employee
{
    private int traffichours;

    public Engineer( String fname, String lname, int empid, int workedhours, double basepay, double payhour,int th) {
        super(fname, lname, empid, workedhours, basepay, payhour);
        this.traffichours = 0;
        this.trafficHours(th);
    }

    
    
    public int getTraffichours() {
        return traffichours;
    }

    public void setTraffichours(int traffichours) {
        this.traffichours = traffichours;
    }
    
    public void trafficHours(int a)
    {
        this.traffichours=a;
        int b=super.getWorkedhours()+a;
        super.setWorkedhours(b);
    }
    
    @Override
    public double weeklypay()
    {
        return (super.getPayperhour()*super.getWorkedhours());
    }
    
    @Override
    public String toString()
    {
        return String.format("First Name:%s\nLast Name:%s\nEmployee ID:%d\nWorked Hours:%d\nPay Per Hour:%.2f\nTraffic Per Hour:%d", super.getFname(),super.getLname(),super.getEmpid(),super.getWorkedhours(),super.getPayperhour(),this.traffichours);
    }
}
