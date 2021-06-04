package Functional_Programing_Exercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split("\\s+");
        Consumer<String> title = str -> System.out.println("Sir " + str);
        for (String name:input ) {
            title.accept(name);
        }
    }
}
