/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik11queue;

/**
 *
 * @author ACER
 */
public class Praktik11queue {
static int ekor=-1;
static int maxEkor=5;
public static void addQueue(String antrian[], String data){
    if(ekor>=maxEkor)
        System.out.println("Maaf, antrian penuh");
    else{
        ekor++;
        antrian[ekor]=data;
    }
}
public static String deQueue(String antrian[]){
    String hasil="";
    if(ekor<0)
        hasil="Maaf, antrian kosong";
    else{
        hasil=antrian[0];
        antrian[0]=null;
        for(int i=1; i<=ekor; i++){
            antrian[i-1]=antrian[i];
            antrian[i]=null;
        }
        ekor--;
    }
    return (hasil);
}
public static void bacaAntrian(String antrian[]){
    System.out.println("Kondisi antrian: ");
    for(int i=0; i<=maxEkor; i++){
        if(i==ekor)
            System.out.println(i+"."+antrian[i]+"ekor");
        else if(antrian [i]==null)
            System.out.println(i+".");
        else
            System.out.println(i+"."+antrian[i]);
    }
}
        public static void main(String[] wawan) {
            String antrian[]=new String [16];
            System.out.println("Antrian mobil");
            addQueue (antrian,"Mobil A");
            addQueue (antrian,"Mobil B");
            addQueue (antrian,"Mobil C");
            addQueue (antrian,"Mobil D");
            addQueue (antrian,"Mobil E");
            addQueue (antrian,"Mobil F");
            System.out.println("\n");
            System.out.println(" ");
            bacaAntrian(antrian);
            System.out.println("\n\nURUTAN KELUAR\nQueue: "+deQueue(antrian));
            System.out.println("Queue: "+deQueue(antrian));
            System.out.println("Queue: "+deQueue(antrian));
            System.out.println("Queue: "+deQueue(antrian));
            System.out.println("Queue: "+deQueue(antrian));
            System.out.println("\n\nSedangkan mobil F masih mengantri");
        
    }
    
}
