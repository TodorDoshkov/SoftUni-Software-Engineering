package QuequeAndStacks_Exersice.Queue_Stacks;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> url = new ArrayDeque<>();
        String currentUrl = "";
        String command = scan.nextLine();

        while (!command.equals("Home")) {
            if (command.equals("back")){
                if (url.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scan.nextLine();
                    continue;
                }
                    String prevUrl = url.pop();
                    currentUrl = prevUrl;


            }else{
                if (!currentUrl.equals("")){
                    url.push(currentUrl);
                }

            currentUrl = command;
            }


            System.out.println(currentUrl);
            command = scan.nextLine();
        }
    }
}
