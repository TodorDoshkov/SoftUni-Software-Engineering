package QuequeAndStacks_Exersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine() ;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String [] numbers = input.split("\\s+");
        for (String element: numbers) {
            stack.push(Integer.parseInt(element));
        }
     while (!stack.isEmpty()){
         System.out.print(stack.pop() + " ");
     }
    }
}
