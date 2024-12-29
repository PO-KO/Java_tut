class A extends Thread {
    @Override
    public void run() { // we should have a run function
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    @Override
    public void run() { // we should have a run function
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultiThreads {
    public void multiThreads() {
        A obj = new A();
        B obj1 = new B();

        obj.start();
        obj1.start();
    }

}
