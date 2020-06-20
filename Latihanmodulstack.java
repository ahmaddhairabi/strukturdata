/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodulstack;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
class Latihanmodulstack {
protected int top, size, len;
public Latihanmodulstack(int n){
size=n;
len=0;
    int[] arr = new int[size];
    top=-1;
}
public boolean isEmpty(){
    return top == -1;
}
public boolean isFull(){
    return top == size-1;
}
public int getSize(){
    return len;
}
public int peek(){
    if(isEmpty())
        throw new NoSuchElementException("Underflow Exception");
    int[] arr = null;
    return arr[top];
}
public void push(int i){
    if(top+1>=size)
        throw new IndexOutOfBoundsException("Overflow Exception");
    int[] arr = null;
    if(top+1<size)
        arr[++top]=i;
    len++;
}
public int pop(){
    if(isEmpty())
        throw new NoSuchElementException("Underflow Exception");
    len--;
    int[] arr = null;
    return arr[top--];
}
public void display(){
    System.out.println("\nStack = ");
    if (len==0){
        System.out.println("Empty\n");
        return;
    }
    String[] arr = null;
    for (int i = top; i>=0; i--)
        System.out.println(arr[i]+" "); 
        System.out.println();
}
public class StackImplement{
    
}
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
        arrayStack stk = new arrayStack(n);
        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            int choice= scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter integer element to push");
                    try{
                        stk.push(scan.nextInt());
                    }
                    catch(Exception e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Popped Element="+stk.pop());
                    }
                    catch (Exception e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        System.out.println("Peek element="+stk.peek());
                    }
                    catch (Exception e){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 4:
                        System.out.println("Empty status="+stk.isEmpty());
                    break;
                case 5:
                        System.out.println("Full status="+stk.isFull());
                    break;
                case 6:
                        System.out.println("Size="+stk.getSize());
                    break;
                default:
                    System.out.println("Wrong Entry \n");
                    break;
            }
            stk.display();
            System.out.println("\nDo you want to continue(Type y or n) \n");
            ch=scan.next().charAt(0);
        }while(ch == 'Y'||ch == 'y');
    }
    
}