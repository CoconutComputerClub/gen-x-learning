
package Tugas;

import java.util.Scanner;


public class Input {
    
    
    public void Pertambahan(){
                          Scanner input = new Scanner(System.in);

                          int anka1 = 0;
                          int angka2 = 0;
                          boolean kondisi;
                          
                          do{
                              System.out.println("###############################");
                              System.out.print("## Masukan Panjang  = ");
                              if(input.hasNextInt()){
                                  anka1 = input.nextInt();
                                  kondisi = true;
                                  do{
                                        System.out.print("## Masukan Lebar    = ");
                                        if(input.hasNextInt()){
                                            angka2 = input.nextInt();
                                            int hasil = anka1 * angka2;
                                            System.out.println("## Luasnya adalah   = "+hasil+" (m2)");
                                            kondisi = true;
                                        }else{
                                            System.out.println("###############################");
                                            System.out.println("## INPUTAN HANYA BOLEH ANGKA ##");
                                            System.out.println("###############################");
                                            // dia akan berulang jika kondisi masih false
                                            kondisi = false;
                                            input.next();
                                        }
                                  }while(!(kondisi));
                                  //kondisi tidak akan berulan jika true maka dari itu saya beri nilai true pada kondisi
                                 
                              }else{
                                  System.out.println("###############################");
                                  System.out.println("## INPUTAN HANYA BOLEH ANGKA ##");
                                  System.out.println("###############################");
                                  // dia akan berulang jika kondisi masih false
                                  kondisi = false;
                                  input.next();
                              }
                          }while(!(kondisi));

   
                         
    }
}

