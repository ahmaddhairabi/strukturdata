/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik7stack;

import java.util.Stack;

public class Praktik7stack {

    public static void main(String[] args) {
        //creating an empty stack
        Stack<Integer> STACK = new Stack<Integer>();
        
        //use push() to add elements into the stack
        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);
        
        //displaying the stack
        System.out.println("Stack Awal:" +STACK);
        
        //pusing elements into the stack
        STACK.push(1254);
        STACK.push(4521);
        
        //displaying the final stack
        System.out.println("Update Stack:"+STACK);
    }
    
}
