/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik6stack;

import java.util.Stack;

public class Praktik6stack {

public static void main(String[] args) {
        //creating an empty stack
        Stack<String> STACK= new Stack<String>();
        
        //use push() to add elements into the stack
        STACK.push("Minggu");
        STACK.push("Senin");
        STACK.push("Selasa");
        STACK.push("Rabu");
        STACK.push("Kamis");
        
        //displaying the stack
        System.out.println("Stack Awal:" +STACK);
        
        //pushing elements into the stack
        STACK.push("Jumat");
        STACK.push("Sabtu");
        
        //displaying the final stack
        System.out.println("Update Stack:" +STACK);
    }
}
