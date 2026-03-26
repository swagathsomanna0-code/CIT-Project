import java.util.Scanner;
public class controlstructures {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the age");
        //int age = sc.nextInt();
        //if (age >=18)
           // System.out.println("Eligible for voting");
            //sc. close();

            //if .else -biggest of two numbers
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = sc.nextInt();
             System.out.println("Enter the second number");
             int b = sc.nextInt();
             if (a > b)
                System.out.println("Frist number is largest");
            else
                System.out.println("Second number is largest");
    }
}
