abstract class Vehicle {

    abstract void accelerate();

    void breaking() {
        System.out.println("Hitting the breaks");
    }
}

class Bike extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Pedalling");
    }
}

class Car extends Vehicle {
    boolean hasFourWheels = true;

    @Override
    void accelerate() {
        System.out.println("Hitting the gas");
    }
}

class BMW extends Car {

    String logo = "blue and white";
}

public class OOP {

    public static void main(String[] args) {


        System.out.println();

        Car newCar = new Car();
        newCar.accelerate();

        Bike newBike = new Bike();
        newBike.accelerate();

        System.out.println();

        Vehicle anotherNewVehicle = new Car();
        anotherNewVehicle.accelerate();

        anotherNewVehicle = new Bike();
        anotherNewVehicle.accelerate();

        anotherNewVehicle = new Car();
        anotherNewVehicle.accelerate();

        Integer number = 1;
        Double number2 = 1.1;
    }
}
