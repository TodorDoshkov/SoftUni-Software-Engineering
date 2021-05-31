package MultidimensionalArrays_Exersice;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        String pattern = input[1];
        int size = Integer.parseInt(input[0]);
        int[][] matrix = new int[size][size];
        int number = 1;
        if (pattern.equals("A")) {
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = number++ ;
                }

            }
        } else if (pattern.equals("B")) {
            for (int col = 0; col < size; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < size; row++) {
                        matrix[row][col] = number++;
                    }
                }else {
                    for (int row = size - 1  ; row >= 0 ; row--) {
                        matrix[row][col] = number++;

                    }
                }
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
