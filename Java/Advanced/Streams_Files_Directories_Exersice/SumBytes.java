package Streams_Files_Directories_Exersice;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Todor\\Desktop\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
        int sumlines = 0 ;
        for (String line : lines) {
            sumlines +=asciiSum(line);
        }
        System.out.println(sumlines);
    }

    private static int asciiSum(String line) {
        int sum = 0;
        for (char symbol : line.toCharArray()) {
            sum += symbol;
        }
        return sum;
    }
}




