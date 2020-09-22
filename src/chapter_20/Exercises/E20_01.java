package chapter_20.Exercises;

import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class E20_01 {
    public static void main(String[] args) throws IOException {
        /*if (args.length != 1) {
            System.out.println("Usage: java E20_01 filename.txt");
            System.exit(1);
        }*/

        String pathName = "E:\\Books + Programming Language Git\\Programming Books\\Programming Books Selected Collection\\Core Java\\Intro-to-java-programming-Daniel-L-Yang\\git\\practice\\Introduction-to-java-pramming-daniel-L-Yang\\src\\chapter_20\\Exercises\\temp.txt";
        File textFile = new File(pathName);

        if (!textFile.exists()) {
            System.out.println("File " + textFile.getName() + " does not exist");
            System.exit(2);
        }

        if (!textFile.isFile()) {
            System.out.println(textFile.getName() + " is a directory");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(textFile);
        ) {
            PriorityQueue<String> queue = new PriorityQueue<>();
            while (input.hasNext()) {
                queue.offer(input.next());
            }

            while (queue.size() > 0) {
                System.out.println(queue.poll());
            }
        }
    }
}
