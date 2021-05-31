package QuequeAndStacks_Exersice;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] command = scan.nextLine().split(" ");
            if (command[0].equals("1")){
                int numberToPush = Integer.parseInt(command[1]);
                stack.push(numberToPush);
            }else if (command[0].equals("2")){
                  stack.pop();
            }else  if (command[0].equals("3")){
                if (!stack.isEmpty()) {
                    System.out.println(Collections.max(stack));
                }
            }

        }
    }
}
