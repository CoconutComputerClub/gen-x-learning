
package Tugas2;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int cariangka ;
        boolean ditemukan = false;
        
        int[] angka = new int[5];
        
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("## Masukan angka pertama = ");
            if(input.hasNextInt()){
              angka[0] = input.nextInt();
              ditemukan = true;
              do{
                  System.out.print("## Masukan angka ke dua = ");
                  if(input.hasNextInt()){
                      angka[1] = input.nextInt();
                      ditemukan = true;
                      do{
                                System.out.print("## Masukan angka ke tiga = ");
                                        if(input.hasNextInt()){
                                            angka[2] = input.nextInt();
                                            ditemukan = true;
                                            do{
                                                System.out.print("## Masukan angka ke empat = ");
                                                if(input.hasNextInt()){
                                                    angka[3] = input.nextInt();
                                                    ditemukan = true;
                                                    do{
                                                            System.out.print("## Masukan angka ke lima = ");
                                                            if(input.hasNextInt()){
                                                                angka[4] = input.nextInt();
                                                                ditemukan = true;
                                                                
                                                                    //  PENCARIAN DATA ARRAY
                                                                    System.out.print("## Cari angka yang di inginkan = ");
                                                                    cariangka = input.nextInt();
                                                                    int j;
                                                                    
                                                                    for(j = 0; j<angka.length; j++){
                                                                        if(angka[j] == cariangka ){
                                                                            ditemukan = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                    
                                                                    if(ditemukan){
                                                                        System.out.println("angka "+angka[j]+ " Berada pada inputan ke "+angka.length + " Dan index ke = " + j);
                                                                    }else{
                                                                        System.out.println("Angka tidak di temukan :) ");
                                                                    }
                                                                
                                                            }else{
                                                                  System.out.println("Inputan hanya boleh angka ");
                                                              ditemukan = false;
                                                              input.next();
                                                            }
                                                        }while(!ditemukan);
                                                }else{
                                                      System.out.println("Inputan hanya boleh angka ");
                                                  ditemukan = false;
                                                  input.next();
                                                }
                                            }while(!ditemukan);
                                        }else{
                                                 System.out.println("Inputan hanya boleh angka ");
                                                ditemukan = false;
                                                input.next();
                                              }
                            }while(!ditemukan);
                  }else{
                        System.out.println("Inputan hanya boleh angka ");
                    ditemukan = false;
                    input.next();
                  }
              }while(!ditemukan);
          }else{
                System.out.println("Inputan hanya boleh angka ");
                ditemukan = false;
                input.next();
            }
        }while(!ditemukan);
 

     
    }
    
}

