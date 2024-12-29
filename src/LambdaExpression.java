/*
 * Functional interface --> an interface with one method
 * Lambda expression --> Sugar syntax of an anonymous inner class (same as arrow function in JS)
 */

@FunctionalInterface
interface A {
    void show(int i);
}

public class LambdaExpression {
    public void lambdaExpression() {
        A obj = i -> System.out.println("Hello" + i); // Lambda expression
    }
}
