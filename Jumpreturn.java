public class jumpreturn {
    public static void main(String[] args) {
        System.out.println("before return statement");
        return;
        // this is not allowed and gives error
        System.out.println("Error after return statement");
    }
}
