import java.util.Scanner;

public class Car {
    String brand;
    String model;
    int speed = 0;

    void accelerate() {
        if (speed < 40) {

            speed = speed + 5;
            System.out.println((brand + "  is accelerating..... " + speed));
        } else
            System.out.println(brand + " is in  Maximum speed");

    }

    void decelerate() {
        if (speed > 0) {
            speed = speed - 5;
            System.out.println(brand + "  Decelerating...... " + speed);
        } else
            System.out.println("Vehicle is not moving");
    }

    void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car brand ");
        brand = sc.nextLine();
        System.out.println("Enter the  car model ");
        model = sc.nextLine();
        System.out.println(brand+ "  " +  model+" is a model");

    }

    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car();
        c.setter();
        c1.setter();
        c.accelerate();
        c1.accelerate();
        c.accelerate();
        c.decelerate();
        c1.decelerate();
        c1.decelerate();
        c1.decelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

    }

}