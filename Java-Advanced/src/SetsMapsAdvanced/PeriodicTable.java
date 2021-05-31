package SetsMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operation = Integer.parseInt(scan.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < operation; i++) {
            String[] input = scan.nextLine().split("\\s+");
            for (String currentElement: input) {
                elements.add(currentElement);

            }
        }
        for (String output: elements) {
            System.out.print(output + " ");
        }
    }
}
