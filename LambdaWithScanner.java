import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Lambda expressions for operations
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtract = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        BiFunction<Integer, Integer, Double> divide = (x, y) -> y != 0 ? (double)x / y : 0.0;

        // Perform operations
        System.out.println("Addition: " + add.apply(a, b));
        System.out.println("Subtraction: " + subtract.apply(a, b));
        System.out.println("Multiplication: " + multiply.apply(a, b));
        System.out.println("Division: " + divide.apply(a, b));

        scanner.close();
    }
}
