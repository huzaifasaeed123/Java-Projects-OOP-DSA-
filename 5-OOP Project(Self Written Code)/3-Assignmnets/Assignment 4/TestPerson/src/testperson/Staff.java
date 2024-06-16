
package testperson;
public class Staff extends Person
{
    private String School;
    private double pay;

    public Staff(String School, double pay, String name, String address) {
        super(name, address);
        this.School = School;
        this.pay = pay;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString()
    {
        return String.format("%s\nSchool:%s\nPay:%.2f",super.toString(),this.School,this.pay);
    }
}
