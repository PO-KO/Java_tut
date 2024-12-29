
import java.util.Scanner;

public class UserInput {
    public void userInput() {
        // Scanner result = new Scanner(System.in);
        // try {
        //     System.out.println(result.nextLine());
        // } finally {
        //     result.close();
        // }

        // Try with resources
        try (Scanner result = new Scanner(System.in)) { // close the resource auto
            System.out.println(result.nextLine());
        }

    }
}
