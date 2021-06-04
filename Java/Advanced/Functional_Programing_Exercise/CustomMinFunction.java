package Functional_Programing_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Consumer<int[]> smallestNumber = array ->System.out.println( Arrays.stream(array).min().orElse(0));
        smallestNumber.accept(numbers);
    }
}
