package Streams_Files_Directories_Exersice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacterTypes {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Todor\\Desktop\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
        Map<String, Integer> symbols = new HashMap<>();
        symbols.put("vowels", 0);
        symbols.put("punctuation", 0);
        symbols.put("consonants", 0);

        for (String line : lines) {
            for (char symbol : line.toCharArray()) {
                if (symbol == ' '){
                    continue;
                }
                if (isVowel(symbol)) {
                    symbols.put("vowels", symbols.get("vowels") + 1);
                } else if (isPunctuation(symbol)) {
                    symbols.put("punctuation", symbols.get("punctuation") + 1);
                } else {
                    symbols.put("consonants", symbols.get("consonants") + 1);
                }
            }
        }
        try {


            BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
            writer.write("Vowels: " + symbols.get("vowels"));
            writer.newLine();
            writer.write("Consonants: " + symbols.get("consonants"));
            writer.newLine();
            writer.write("Punctuation: " + symbols.get("punctuation"));
            writer.close();

        }catch (IOException io){
            System.out.println("Error while printing output");
        }
    }

    private static boolean isPunctuation(char symbol) {
        return symbol == '.' || symbol == ',' || symbol == '!' || symbol == '?';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'i' || symbol == 'u'
                || symbol == 'o' || symbol == 'e';
    }


}
