/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacked;

import java.util.Stack;

public class Stacked {

    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        
        mystack.push(5);
        mystack.push(10);
        mystack.push(15);
      
        System.out.println("Stack: " + mystack);
        
         int topElement = mystack.pop();
        System.out.println("Popped: " + topElement);
        
         int peekedElement = mystack.peek();
        System.out.println("Peeked: " + peekedElement);

         boolean isEmpty = mystack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);
        
         int stackSize = mystack.size();
        System.out.println("Stack Size: " + stackSize);
    }
    
}
