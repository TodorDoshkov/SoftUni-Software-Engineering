package Functional_Programing_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        List<String> names = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        Predicate<String> predicate = e -> e.length() > length ;
        names.removeIf(predicate);
        names.forEach(System.out::println);

    }
}
