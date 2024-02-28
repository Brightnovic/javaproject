import java.util.InputMismatchException;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        System.out.println(" calculate the numbers you'd like! :)");
        Assignment obj1 = new Assignment();
        long result = obj1.addManyNum();
        System.out.println("The total sum is: " + result);
    }
}

class Assignment {
    public long addManyNum() {
        long numToSum = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("How many numbers would you like to add?: ");
            int many = scanner.nextInt();

            while (many != 0) {
                try {
                    System.out.print("Enter a number: ");
                    int userInput = scanner.nextInt();
                    numToSum += userInput;
                    many--;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer. :)");
                
                    scanner.next();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for the number of iterations.");
        } finally {
 
            scanner.close();
        }

        
        return numToSum;
    }
}
