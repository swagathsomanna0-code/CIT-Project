public class JumpReturnExample {

    // Method using return
    public static int findNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {

            // continue example: skip negative numbers
            if (arr[i] < 0) {
                continue;
            }

            // if target found, return index
            if (arr[i] == target) {
                return i;
            }
        }

        // return -1 if not found
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, -5, 20, 30, -2, 40};

        // break example
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                System.out.println("Stopping loop at value: " + numbers[i]);
                break; // stops loop
            }
            System.out.println(numbers[i]);
        }

        // calling method with return
        int result = findNumber(numbers, 20);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found");
        }
    }
}