
interface Accelerateable {

    void accelerate();
}

interface Hoonkable {
    void hoonk();
}

interface Driveable{
    void accelerate();
    void breaking();
}

abstract class Vehicle implements Accelerateable, Hoonkable{

    void breaking() {
        System.out.println("Hitting the breaks");
    }
}

class Bike extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Pedalling");
    }

    @Override
    public void hoonk() {
        System.out.println("klingel");
    }
}

class Car extends Vehicle {
    boolean hasFourWheels = true;

    @Override
    public void accelerate() {
        System.out.println("Hitting the gas");
    }

    @Override
    public void hoonk() {
        System.out.println("hupe");
    }
}

class BMW extends Car implements Driveable {

    String logo = "blue and white";

    @Override
    public void hoonk() {
        System.out.println("laute hupe");
    }

    @Override
    public void breaking() {
        System.out.println("break");
    }
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

        BMW bmw = new BMW();
        bmw.accelerate();
        bmw.hoonk();
    }
}
