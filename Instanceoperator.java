class Animal{

}

public class Instanceoperator {
    public static void main(String[] args) {
        Animal an = new Animal();
        Animal as = new Animal();
        Tiger tg = new Tiger();

        System.out.println(an instanceof Animal);
        System.out.println(as instanceof Animal);
        //it is not allowed
        System.out.println(tg instanceof Animal);

        //The purpose of using the instanceof operator in
        //java is to check whether an object belongs to
        // a particular class or interface type at runtime.
    }
    
}
