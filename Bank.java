public class Bank {
    public static void main(String[] args) {
        int balance=1003;
        int amount= 500;
        void deposit(int amount) {
            balance =balance+amount;
            System.out.println(amount+"is deposit");
            return 0;
        }
    }
}

