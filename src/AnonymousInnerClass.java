class A {
    public void show() {
        System.out.println("in A show");
    } 
}

public class AnonymousInnerClass {
    public void anonymousInnerClass() {
        A obj = new A() {
            public void show() {
                System.out.println("in new A show");
            } 
        };
        
        obj.show();
    }
}
