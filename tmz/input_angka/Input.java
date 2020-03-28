
package tmz.input_angka;

import java.util.Scanner;


public class Input {
    
    
    public void Percobaan(){
                          Scanner input = new Scanner(System.in);

                          int angka1 = 0;
                          int angka2 = 0;
                          boolean kondisi;
                          
                          do{
                             
                              System.out.print("Masukan Panjang \t= ");
                              if(input.hasNextInt()){
                                  angka1 = input.nextInt();
                                  kondisi = true;
                                  do{
                                        System.out.print("Masukan Lebar \t\t= ");
                                        if(input.hasNextInt()){
                                            angka2 = input.nextInt();
                                            int hasil = angka1 * angka2;
                                            System.out.println("Hasilnya adalah \t= "+hasil);
                                            kondisi = true;
                                        }else{
                                           
                                            System.out.println(" \n\tInputan Harus Berupa Angka..!! ");

                                            // dia akan berulang jika kondisi masih false
                                            kondisi = false;
                                            input.next();
                                        }
                                  }while(!(kondisi));
                                  //jika true  kondisi tidak akan berulang
                                 
                              }else{
                                 
                                  System.out.println("\n\tInputan Harus Berupa Angka..!!");
                                  // ini akan berulang jika kondisi masih false
                                  kondisi = false;
                                  input.next();
                              }
                          }while(!(kondisi));

   
                         
    }
}

