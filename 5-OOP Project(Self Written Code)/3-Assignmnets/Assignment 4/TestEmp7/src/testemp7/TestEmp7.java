
package testemp7;

/**
 *
 * @author saeed
 */
public class TestEmp7 {

    public static void main(String[] args) {
        
        double sum=0;
        Employee [] arr=new Employee[6];
        arr[0]= new Manager("Huzaifa","Saeed",1,45,0,120.0,10);
        arr[1]= new Manager("Ammar","Ali",2,55,0,255.0,5);
        arr[2]=new Engineer("Baisr","Saeed",3,70,0,220,8);
        arr[3]=new Engineer("Philip","Smith",4,42,0,124.50,12);
        arr[4]=new Engineer("Adam","Pancer",5,38,0,248.00,5);
        arr[5]=new Engineer("Sofia","Stevenson",6,44,0,320.00,7);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
            System.out.printf("Updated Salary after adding:%.2f\n\n",arr[i].weeklypay());
            
            sum=sum+arr[i].weeklypay();
        }
        System.out.printf("Total PAyment That company have to pay:%.2f\n",sum);
        
        
    }
    
}
