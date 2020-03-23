
package Tugas1;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
                      System.out.println("###############################");
	    System.out.println("##  ##### ####  #   # #####  ##");
	    System.out.println("##  #   # #     #   # #      ##");
	    System.out.println("##  ##### ##### #   # #####  ##");
	    System.out.println("##  #   # #   # #   #     #  ##");
	    System.out.println("##  #   # ##### ##### #####  ##");
	    System.out.println("###############################");
            
                      System.out.println("### WELCOME TO TUGASKU WKWKW ##");
        
                       Gantiwarna objek = new Gantiwarna();
        
                        Scanner input = new Scanner(System.in);
                        
                        System.out.print("Masukan nama pertama = ");
                        String nama1 = input.nextLine();
                        objek.setNama1(nama1);
                        
                        System.out.print("Masukan warna yang di sukai = ");
                        String warna1 = input.nextLine();
                        objek.setWarna1(warna1);
                        
                        System.out.println("###############################");
                        
                        System.out.print("Masukan nama kedua = ");
                        String nama2 = input.nextLine();
                        objek.setNama2(nama2);
                        
                         System.out.print("Masukan warna yang di sukai = ");
                         String warna2 = input.nextLine();
                         objek.setWarna2(warna2);
                        
                          System.out.println("###############################");
                          
                          
                        System.out.print("Masukan nama ketiga = ");
                        String nama3 = input.nextLine();
                        objek.setNama3(nama3);
                        
                         System.out.print("Masukan warna yang di sukai = ");
                         String warna3 = input.nextLine();
                         objek.setWarna3(warna3);
                          
                         System.out.println("###############################");
                         System.out.println("###############################");
                         
                          System.out.println("nama pertama adalah = "+objek.getNama1());
                          System.out.println("warna yang disukai = "+objek.getWarna1());
                          
                           System.out.println("###############################");
                           
                          System.out.println("nama kedua adalah = "+objek.getNama2());
                          System.out.println("warna yang disukai = "+objek.getWarna2());
                          
                            System.out.println("###############################");
                            
                            System.out.println("nama ketiga adalah = "+objek.getNama3());
                            System.out.println("warna yang di sukai = "+ objek.getWarna3());
                          
                          
    }
    
}

