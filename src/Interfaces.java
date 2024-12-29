/*
 * Interfces work the same like abstract class but is not a class
 * class - class -> extends
 * interface - class -> implements
 * interface - interface -> extends
 * in interface we can implements multiple interfaces in the same class
 * in interface we can inherit multiple interfaces
 */

interface A {
    int age = 24; // by default vars are final and static
    void show(); // by default are public and abstract
}
interface C {
    int age = 24; // by default vars are final and static
    void show(); // by default are public and abstract
}
interface D extends A, C {
    int age = 24; // by default vars are final and static
    void show(); // by default are public and abstract
}

class B implements A, C {
    public void show() {
        System.out.println("In B show");
    }
    
}

public class Interfaces {
    public void interfaces() {
        A obj; // we can create a ref var from an interface but we can not create in instance from it
        // obj = new A() // Error
        obj = new B();
        System.out.println(A.age);
        
    }
}
