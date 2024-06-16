import java.util.Scanner;

public class DataType {
    public static void main(String[] args){
        System.out.println("Enter Your Name and Age");
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();
        long b = input.nextLong();

        System.out.printf("%s!!,you are %d year old",c,b);

    }
}
