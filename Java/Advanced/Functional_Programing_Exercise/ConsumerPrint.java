package Functional_Programing_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split("\\s+");
        Arrays.stream(input).forEach(System.out::println);
    }
}
