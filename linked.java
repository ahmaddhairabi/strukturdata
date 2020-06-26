/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodulqueue;

/**
 *
 * @author ACER
 */
class linked {
Latihanmodulqueue head,tail;
public linked(){
    head=null;
    tail=null;
}

public void enque(){
    Latihanmodulqueue baru=new Latihanmodulqueue();
    baru.input();
    if(head==null)head=baru;
    else tail.next=baru;
    tail=baru;
}
public void deque(){
    if(head==null)System.out.println("-Kosong-");
    else{
        System.out.println("Keluar Data dengan id: "+head.id);
        head=head.next;
    }
}
public void view(){
    if(head==null)System.out.println("-Kosong-");
    else{
        System.out.println("||Id\t||Nama\t||Keperluan\t||");
        for(Latihanmodulqueue a=head; a!=null; a=a.next)a.read();
    }
}
    
        
    }
    

