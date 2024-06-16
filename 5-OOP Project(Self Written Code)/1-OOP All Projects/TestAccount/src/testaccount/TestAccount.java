
package testaccount;

/**
 *
 * @author fa21-bcs-020
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date doi1=new Date(03,06,2022);
        Date doe1=new Date(03,06,2028);
        Date doi2=new Date(05,03,2021);
        Date doe2=new Date(06,02,2027);
        AtmCard a=new AtmCard("3483-43743763-8438",doi1,doe1);
        AtmCard e=new AtmCard("3483-43743763-8438",doi2,doe2);
        Account b=new Account(01,"Huzaifa Saeed",5010.00,100.00,"saeedhuzaifa78@gmail.com",a);
         Account c=new Account(01,"Huzaifa Saeed",6000.00,100.00,"suytyfg@gmail.com",e);
        b.deposit(300.0);
        b.withdraw(100.0);
        System.out.println(b.toString());
        System.out.println(c.toString());
       
    }
    
}
