public class TypeCastingOpertor {
    public static void main(String[] args) {
        double d=9.78;

        //exlicit type conversion
        int num =(int)d;
        System.out.println("Double value before conversion:"+d);
        System.out.println("After exlicit type  conversion:"+num);
        //implicit type conversion
        int x=90;
        double value=x;
        System.out.println("Implicit type conversion:"+value);
    }
}
