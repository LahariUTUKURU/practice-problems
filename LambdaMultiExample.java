import java.util.function.*;

public class LambdaMultiExample {
    public static void main(String[] args) {
        
        // Addition using BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(10, 20));

        // Subtraction using BiFunction
        BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.apply(20, 10));

        // Multiplication using BiFunction
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.apply(5, 4));

        // Division using BiFunction
        BiFunction<Integer, Integer, Double> divide = (a, b) -> b != 0 ? (double) a / b : 0.0;
        System.out.println("Division: " + divide.apply(20, 4));

        // Check even number using Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Is 10 Even? " + isEven.test(10));

        // Convert to uppercase using Function
        Function<String, String> toUpper = str -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpper.apply("lambda expressions"));

        // Print message using Consumer
        Consumer<String> display = msg -> System.out.println("Message: " + msg);
        display.accept("This is a lambda multi-operation demo!");

        // Constant value using Supplier
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
    }
}
