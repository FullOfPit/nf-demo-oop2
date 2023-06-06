class Vehicle {

    void accelerate() {
        System.out.println("I am accelerating!");
    }
}

class Bike extends Vehicle {

}

class Car extends Vehicle {

    boolean hasFourWheels = true;
}

class BMW extends Car {

    String logo = "blue and white";
}

public class OOP {

    public static void main(String[] args) {

        Vehicle newVehicle = new Vehicle();
        newVehicle.accelerate();

        System.out.println();

        Car newCar = new Car();
        newCar.accelerate();
        System.out.println(newCar.hasFourWheels);

        System.out.println();

        BMW newBMW = new BMW();
        System.out.println(newBMW.hasFourWheels);
        newBMW.accelerate();
        System.out.println(newBMW.logo);


        Vehicle anotherNewVehicle = new Car();
        anotherNewVehicle = new Bike();
        anotherNewVehicle = new Car();

        anotherNewVehicle.accelerate();
    }
}
