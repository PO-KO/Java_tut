/*
 * For every premitive type we have a wrapper class
 *  int --> Integer
 *  double --> Double
 * They have usefull methods
*/
public class WrapperClass {
    public void wrapperClass() {
        int num = 8;
        Integer num1 = num; // Autoboxing

        int num2 = num1.intValue(); // Unboxing
        int num3 = num1; // Auto-Unboxing

        System.out.println();
    }
    
}
