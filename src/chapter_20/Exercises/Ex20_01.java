package chapter_20.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex20_01 {
    public static void main(String[] args) throws FileNotFoundException {
        String pathName = "E:\\Books + Programming Language Git\\Programming Books\\Programming Books Selected Collection\\Core Java\\Intro-to-java-programming-Daniel-L-Yang\\git\\practice\\Introduction-to-java-pramming-daniel-L-Yang\\src\\chapter_20\\Exercises\\temp.txt";

        // Create a new file
        File textFile = new File(pathName);

        // Impose validation: file exists or not
        if (!textFile.exists()) {
            System.out.println("File " + textFile.getName() + " does not exist");
            System.exit(1);
        }

        // Impose validation: It is a file or not
        if (!textFile.isFile()) {
            System.out.println(textFile.getName() + " is a directory");
            System.exit(2);
        }

        // read from the file and add to the priority queue
        try (
                Scanner input = new Scanner(textFile);
        ) {
            PriorityQueue<String> priorityQueue = new PriorityQueue<>();
            while (input.hasNext()) {
                priorityQueue.offer(input.next());
            }

            while (priorityQueue.size() > 0) {
                System.out.println(priorityQueue.poll());
            }
        }

    }
}
