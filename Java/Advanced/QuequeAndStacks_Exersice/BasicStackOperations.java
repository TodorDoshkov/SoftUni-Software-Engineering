package QuequeAndStacks_Exersice;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String [] commands = scan.nextLine().split("\\s+");
        String [] elements = scan.nextLine().split("\\s+");
        int numberToPush = Integer.parseInt(commands[0]);
        for (int i = 1; i <=numberToPush ; i++) {
            stack.push(elements[i - 1]);
        }
        int elementsToRemove = Integer.parseInt(commands[1]);
        for (int i = 1; i <=elementsToRemove ; i++) {
            stack.pop();
        }
        if (stack.contains(commands[2])) {
            System.out.println("true");
        } else {
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else {
                System.out.println(0);
            }
        }

    }
}
