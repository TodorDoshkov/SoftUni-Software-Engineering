package SetsMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Set<Integer> firstLine = new LinkedHashSet<>();
        Set<Integer> secondLine = new LinkedHashSet<>();
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        for (int i = 0; i < n; i++) {
            firstLine.add(scan.nextInt());
        }
        for (int i = 0; i < m; i++) {
            secondLine.add(scan.nextInt());
        }
        firstLine.retainAll(secondLine);
        for (int number : firstLine) {
            System.out.print(number + " ");

        }
    }
}
