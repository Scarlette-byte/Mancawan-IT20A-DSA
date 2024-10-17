
package queue;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
 
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
     
        
        Integer firstElement = queue.poll();
        Integer secondElement = queue.poll();
        
       
        System.out.println("Remaining elements in the queue: " + queue);
        
       
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Date");
        stringQueue.add("Helium");
        
     
        System.out.println("Elements in the string queue: " + stringQueue);
        
        
        String thirdElement = stringQueue.poll();
        System.out.println("Polled from string queue: " + thirdElement);
        System.out.println("Remaining elements in the string queue: " + stringQueue);
    }
}
