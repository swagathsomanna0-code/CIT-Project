import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        if (age > 21 && salary >= 21000) {
            System.out.println(name + " is eligible to apply for a loan.");
        } else {
            System.out.println(name + " is NOT eligible to apply for a loan.");
        }
    }
}