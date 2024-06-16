
package assignment_2_dsa;

public class Assignment_2_DSA {

   
    public static void main(String[] args) {
        Randomizer r=new Randomizer();
        r.insert(5);
        r.insert(6);
        r.insert(8);
        r.insert(9);
        r.dispaly();
        
                System.out.println("after delete");

        r.delete();
        r.delete();
        r.dispaly();
    }
    
}
