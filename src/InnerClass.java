class A {
    public void show() {
        System.out.println("in A show");
    }

    class B {

    }
    static class C {

    }
}


public class InnerClass {
    public void innerClass() {
        A obj = new A();

        A.B obj1 = obj.new B(); // Non static class we use obj.new B()
        A.C obj2 =  new A.C(); // C is a static class here
    }
}
