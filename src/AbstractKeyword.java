/*
 * Abstract class
 * * You can not create an object from it
 * * You can create an refrence variable from it
 * * Can have anything in it like normal class
 */

abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("Play music...");
    }
}

class Mercedes extends Car {

    public void drive() {
        System.out.println("Drive...");
    }
    
}

public class AbstractKeyword {
    public void abstractKeyword() {
        Car car1 = new Mercedes();
        car1.drive();
    }
}
