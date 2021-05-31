package QuequeAndStacks_Exersice;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            queue.offer(scan.nextInt());

        }
        for (int i = 1; i <=s ; i++) {
            queue.poll();
        }
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println(0);
            }
        }
    }
}
