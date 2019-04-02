package Polymorphism2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi("A4",8);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Ford ford = new Ford("Focus",8);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Mustang mustang = new Mustang("Focus",8);
        System.out.println(mustang.startEngine());
        System.out.println(mustang.accelerate());
        System.out.println(mustang.brake());
    }
}
