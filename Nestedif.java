import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        //int age=65;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to vote and avail goverment fund");

            }else
                System.out.println("we are  eligible to vote and avail goverment foud");

        }else
            System.out.println("We are not eligible to vote");
    }
}
