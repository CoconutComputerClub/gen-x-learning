
package Tugas2;

import java.util.Scanner;

public class Array {
   
    public static void main(String[] args) {
            int[] angka = new int[5];
            int cari_angka = 0;
            boolean kondisi = false;
            int j = 0;
            Scanner input = new Scanner(System.in);
            
            for(int i = 0; i<angka.length; i++){
                do{
                    System.out.print("Masukan angka ke "+(i+1)+" = ");
                    if(input.hasNextInt()){
                        angka[i] = input.nextInt();
                        kondisi = true;
                    }else{
                        System.out.println("Inputan hanya boleh angka");
                        kondisi = false;
                        input.next();
                    }
                }while(!kondisi);
            }
            
           
           do{
               System.out.print("Masukan angka yang ingin di cari = ");
              if(input.hasNextInt()){
                  cari_angka = input.nextInt();
                  kondisi = true;
                  for( j = 0; j <angka.length; j++){
                      if(cari_angka == angka[j]){
                          kondisi = true;
                          break;
                      }
                  }
              }else{
                  input.next();
                  kondisi = false;
              }
           }while(!kondisi);
        
           try{
               if(kondisi == true){
                    System.out.println("Angka "+angka[j]+" Berada pada inputan "+(j+1)+" dan index ke = "+j);
               }
           }catch(IndexOutOfBoundsException e){
               System.out.println("angka tidak ada");
           }
           
 }
}
