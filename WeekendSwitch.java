import java.util.Scanner;

public class WeekendSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int day = sc.nextInt();

        switch(day) {
            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day given");
        }

        sc.close();
    }
}