/*
 * Enum is a class
 * Everything inside is objects
 * You can create objects from enum inside the same enum
 */

enum Status {
    Running, Success, Failed, Pending; // Constants
}

enum Laptop {
    Macbook(200), Thinkpad(150), MS(100), Asus(300), HP;
    int price;
    private Laptop() {
        price = 120; // HP = 120
    }
    private Laptop (int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class Enum {
    public void enumMethod() {
        Status ss = Status.Running; // output: Running
        Status[] sss = Status.values(); // Array of Status values


    }
}
