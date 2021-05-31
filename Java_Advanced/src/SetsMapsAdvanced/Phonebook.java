package SetsMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String , String> contacts = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("search")){
            String[] commands = input.split("-");


            input = scan.nextLine();
        }


    }
}
