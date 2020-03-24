package material;

import java.util.ArrayList;
import java.util.Scanner;

public class array {
        
    public static void main(String[] args) {

        ArrayList<Integer> ccn10 = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        
        String[] bph = {
          "Agus","Andry","Obo","Alexander","Wahid"  
        };
        
        for(String nama : bph) {
            System.out.println("Angka  adalah : " + nama);
        }
        
        ccn10.add(34);
        ccn10.add(26);
        System.out.println("Sebelum Penambahan \n");
        for(int i = 0;i < ccn10.size();i++) {
            System.out.println("Angka ke " + (i+1) + " adalah : " + ccn10.get(i));            
        }
        
        ccn10.add(63);
        ccn10.add(3);
        ccn10.add(10);
        System.out.println("\nSetelah Penambahan \n");
        for(int sembarang : ccn10) {
            System.out.println("Angka  adalah : " + sembarang);            
       
        }
        
        ccn10.set(3, 90);
        System.out.println("\nSetelah Perubahan \n");
        for(int i = 0;i < ccn10.size();i++) {
            System.out.println("Angka ke " + (i+1) + " adalah : " + ccn10.get(i));            
        }

        
        ccn10.remove(4);
        
        System.out.println("\nSetelah Pengurangan \n");
        for(int i = 0;i < ccn10.size();i++) {
            System.out.println("Angka ke " + (i+1) + " adalah : " + ccn10.get(i));            
        }
        
        ccn10.clear();
        System.out.println("\nSetelah Data di Hapus \n");
        for(int i = 0;i < ccn10.size();i++) {
            System.out.println("Angka ke " + (i+1) + " adalah : " + ccn10.get(i));            
        }
        
    }
    
}
