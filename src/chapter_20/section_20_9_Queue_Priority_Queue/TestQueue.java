package chapter_20.section_20_9_Queue_Priority_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        // add 3 elements in the queue and remove them using while loop
        Queue queue = new LinkedList();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while(queue.size() > 0){
            System.out.println(queue.remove() + " ");
        }


    }
}
