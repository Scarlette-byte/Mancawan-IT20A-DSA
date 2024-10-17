/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.LinkedList;
public class Linkedlist {


    public static void main(String[] args) {
        LinkedList <String> animals = new LinkedList<>();
        animals.add("Monkey");
        animals.addFirst("Donkey");
        animals.addLast("Elephant");
        animals.add(1, "Lion");
        
        System.out.println("Linked List Original: " + animals);
         System.out.println(animals.size());

        Boolean containsMonkey = animals.contains("Monkey");
        System.out.println("");
        }
}
