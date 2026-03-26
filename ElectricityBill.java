import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 150) {
            bill = units * 1.5;
        } else {
            bill = units * 3;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
}
