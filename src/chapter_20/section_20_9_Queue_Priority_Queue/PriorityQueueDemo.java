package chapter_20.section_20_9_Queue_Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a priority queue , add and remove elements
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("Oklahoma");
        priorityQueue1.add("Indiana");
        priorityQueue1.add("Georgia");
        priorityQueue1.add("Texas");

        while (priorityQueue1.size() > 0){
            System.out.print(priorityQueue1.remove()+" ");
        }
        System.out.println();

        // Create a priority queue , add and remove elements in reverse order
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        priorityQueue2.add("Oklahoma");
        priorityQueue2.add("Indiana");
        priorityQueue2.add("Georgia");
        priorityQueue2.add("Texas");

        while (priorityQueue2.size() > 0){
            System.out.print(priorityQueue2.remove()+" ");
        }
    }
}
