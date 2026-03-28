public class FirstDigit {
    public static void main(String[] args) {
        int num = 56;

        while (num >= 10) {
            num = num / 10;
        }

        System.out.println("First digit is: " + num);
    }
}