/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodulqueue;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Latihanmodulqueue {
int id;
String nama, perlu;
Latihanmodulqueue next;
static Scanner in=new Scanner(System.in);
static Scanner str=new Scanner(System.in);
public void input(){
    System.out.print("Masukkan id(angka): ");
    id=in.nextInt();
    System.out.print("Masukkan nama: ");
    nama=str.nextLine();
    System.out.print("Masukkan keperluan: ");
    perlu=str.nextLine();
    next=null;
}
public void read(){
    System.out.println("||"+id+"\t||"+nama+"\t||"+perlu+"\t||");
}
    public static void main(String[] args) {
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n: ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)System.out.println("-keluar-");
            else System.out.println("-Salah-");
            System.out.println("");
        }
    }

}