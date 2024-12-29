class A {
    public void show1() {
        System.out.println("in A");
    }
}
class B extends A {
    public void show2() {
        System.out.println("in B");
    }
}

public class DowncastingUpcasting {
    public void upCasting() {
        A obj = (A) new B(); // happen behind the scenes even if u dont mention it
         obj.show1();
    }

    public void downCasting() {
        A obj = new B();

        B obj1 = (B) obj; // down casting it becuz we can't store type A (obj) to type B (obj1)
        obj1.show2();

    }
    
}
