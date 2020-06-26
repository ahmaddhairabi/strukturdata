/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik12linkedlist;

import java.util.LinkedList;

/**
 *
 * @author ACER
 */
public class Praktik12linkedlist {

    public static void main(String[] args) {
        //membuat objek yang bernama daftar pada class linked list
        LinkedList<String> daftar= new LinkedList<String>();
        //menambahkan elemen pada linked list
        daftar.add("A");
        daftar.add("B");
        daftar.addLast("C");
        daftar.addFirst("D");
        daftar.add(3, "B");
        daftar.add("F");
        daftar.add("G");
        System.out.println("Linked List: "+daftar);
        //menghapus elemen dari linked list
        daftar.remove("B");
        daftar.remove(3);
        daftar.removeFirst();
        daftar.removeLast();
        System.out.println("Linked list setelah dihapus: "+daftar);
        //menemukan elemen pada linked list
        boolean status=daftar.contains("E");
        if(status)
            System.out.println("Di list terdapat elemen 'E'");
        else
            System.out.println("Di list tidak terdapat elemen 'E'");
        
        //ukuran dari elemen pada linked list
        int size=daftar.size();
        System.out.println("Ukuran dari linked list: "+size);
        
        //menunjukkan dam memberi nilai elemen dari linked list
        Object elemen=daftar.get(2);
        System.out.println("elemen ditunjui oleh get(): "+elemen);
        daftar.set(2, "Y");
        System.out.println("Linked list pasca perubahan: "+daftar);
    }
    
}
