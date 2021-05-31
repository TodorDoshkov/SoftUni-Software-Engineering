package QuequeAndStacks_Exersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean balance = false;
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        for (int i = 0; i <input.length() ; i++) {
         char currentBracket = input.charAt(i);
         if (currentBracket == '[' || currentBracket=='('|| currentBracket == '{'){
             openBrackets.push(currentBracket);
         }
         else if (currentBracket == ')' || currentBracket == ']' || currentBracket == '}' ){
             if (openBrackets.isEmpty()){
                 balance= false;
                 break;
             }
           char lastOpenBracket = openBrackets.pop();
           if (lastOpenBracket == '(' && currentBracket == ')'){
               balance = true;
           }else if (lastOpenBracket == '[' && currentBracket == ']'){
               balance = true;
           }else if (lastOpenBracket == '{' && currentBracket == '}'){
               balance = true;
           }else {
               balance = false ;
               break;
           }
         }

        }
        if (balance){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
