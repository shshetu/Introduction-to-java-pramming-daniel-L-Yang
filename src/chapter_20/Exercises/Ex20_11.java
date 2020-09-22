package chapter_20.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Ex20_11 {
    public static void main(String[] args) {
        String fileName = "E:\\Books + Programming Language Git\\Programming Books\\Programming Books Selected Collection\\Core Java\\Intro-to-java-programming-Daniel-L-Yang\\git\\practice\\Introduction-to-java-pramming-daniel-L-Yang\\src\\chapter_20\\Exercises\\bracket-check.txt";
        File file = new File(fileName);

        // check file name exists
        if(!file.exists()) {
            System.out.println("File "+file.getName()+" does not exist");
        }

        // check the file is not directory
        if(!file.isFile()) {
            System.out.println(file.getName()+" is not a file");
        }

        // Grouping symbol check
        if(groupingSymbolsCorrect(file)) System.out.println("Grouping symbols correct");
        else System.out.println("Grouping symbols incorrect");
    }

    public static boolean groupingSymbolsCorrect(File file){
        try (Scanner input = new Scanner(file);) {
            Stack<Character> stack = new Stack<>();
            while (input.hasNext()) {
                String s = input.next().replaceAll("\'.*\'","");
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    System.out.println(stack);
                    if(c == '(' || c == '{'||c == '[') stack.push(c);
                    else if(c == ')' || c == '}'||c == ']') {
                        if(stack.empty()) return false;
                        if (!(stack.pop() == getOpeningSymbol(c))) return false;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    private static char getOpeningSymbol(char c) {
        char[] opening = {'(','{','['};
        char[] closing = {')','}',']'};
        for (int i = 0; i <closing.length ; i++) {
            if (c == closing[i]) return opening[i];
        }
        return 'z';
    }
}
