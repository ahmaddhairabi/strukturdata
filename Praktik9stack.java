
package praktik9stack;

import java.util.Stack;

public class Praktik9stack {

    public static void main(String[] args) {
        //creating an empty stack
        Stack<Integer> STACK = new Stack<Integer>();
        
        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);
        
        //displaying the stack
        System.out.println("Stack Awal:" +STACK);
        
        //removing elements using pop() method
        System.out.println("Pop Element: " +STACK.pop());
        System.out.println("Pop Element: " +STACK.pop());
        
        //displaying the stack after pop operation
        System.out.println("Update Stack " +STACK);
    }
    
}

