/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik8stack;

import java.util.Stack;

public class Praktik8stack {

    public static void main(String[] args) {
        //creating an empty stack
        Stack<String> STACK = new Stack<String>();
        
        STACK.push("Minggu");
        STACK.push("Senin");
        STACK.push("Selasa");
        STACK.push("Rabu");
        STACK.push("Kamis");
        
        //displaying the stack
        System.out.println("Stack Awal:" +STACK);
        
        //removing elements using pop() method
        System.out.println("Pop Element: " +STACK.pop());
        System.out.println("Pop Element: " +STACK.pop());
        
        //displaying the stack after pop operation
        System.out.println("Update Stack " +STACK);
    }
    
}
