import java.util.Scanner;

public class Factorial {
    public static int fact(int num) {
        // Base case for recursion
        if (num == 0 || num == 1) {
            return 1; // 0! = 1 and 1! = 1
        }
        // Recursive case
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is " + fact(num));
        }
        
        sc.close(); // Closing the scanner
    }
}
