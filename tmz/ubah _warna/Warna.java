package tmz.ubah_warna;
import java.util.Scanner;

class Warna{
    String obo, agus, nando, pilih;
    boolean suka,ulang;
    Scanner input  = new Scanner(System.in);
    
    public void warna() {
        String ganti, ganti1, ganti2,ganti4,ganti5,ganti3, tukar;
        
        suka=true;
    do{
        System.out.print("warna baju agus \t= ");
        agus = input.nextLine();
        System.out.print("warna baju obo \t\t= ");
        obo = input.nextLine();
        System.out.print("warna baju nando \t= ");
        nando = input.nextLine();
        
    
        System.out.println("\n\tSETELAH DI TUKAR");
    
        ganti = this.nando;
        System.out.println("\nwarna baju agus \t= "+ganti);
        ganti1 = this.agus;
        System.out.println("warna baju obo \t\t= "+ganti1);
        ganti2 = this.obo;
        System.out.println("warna baju nando \t= "+ganti2);

        ganti3 = this.obo;
        System.out.println("\nwarna baju agus \t= "+ganti3);
        ganti4 = this.nando;
        System.out.println("warna baju obo \t\t= "+ganti4);
        ganti5 = this.agus;
        System.out.println("warna baju nando \t= "+ganti5);
        System.out.println("\n\tTERIMAKASIH ATAS PARTISIPASINYA");
        
       
        
       
             do {
                        ulang=true;
            System.out.println("apakah ingin tukar warna ? (ya/tidak)");
             
                try{
                        tukar = input.nextLine();
                    
                    if (tukar.equals("ya")){
                    
                        suka =false;
            // ulang=true;
            
            
                    }else if(tukar.equals("tidak")){
                
                         suka = true;
                         System.out.println("\t\tTERIMAKASIH :-)");
                    }else{
                         System.out.println("Pilahan anda salah hanya ada ya/tidak");
                        ulang=false;
                    }
                
            
                    
                } catch (Exception exception) {
                    //TODO: handle exception
                }
            }while(!ulang);
        
    }while(!suka);

   }
}
    