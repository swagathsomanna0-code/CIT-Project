public class UnaryOperators {
    public static void main(String[] args) {
        int x=5;
        System.out.println("Original:"+x);
        //++x (pre increment)
        System.out.println("post increment:"+(x++));//5
        System.out.println("After increment:"+x);//6
        System.out.println("pre increment:"+(++x));
        System.out.println("pre decrment:"+(--x));

    }
}
