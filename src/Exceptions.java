/*
 * Types of erros
 * * Compile time error --> Ex: Syntax
 * * Runtime error (Exception) --> Ex: Loading a file does not exist, dividing by 0
 * * Logical error (Bugs) --> Ex: Excepting the result to be 4 but you got 5
 */

public class Exceptions {
    public void exception() {
        int i = 0;

        try { // Handling the exception
            System.out.println(8 / i);
        } catch (Exception e) {
            System.out.println("Some thing went wrong");
        }

        System.out.println("Aslam Alykum");
    }
}
