package Functional_Programing_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String command = scan.nextLine();
        Function<int[], int[]> add = array -> Arrays.stream(array).map(e -> e += 1).toArray();
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(e -> e *= 2).toArray();
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(e -> e -= 1).toArray();
        Consumer<int[]> print = array -> Arrays.stream(array).forEach(e -> System.out.print(e + " ") );

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }


            command = scan.nextLine();
        }
    }
}
