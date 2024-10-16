
import java.util.Scanner;


public class TugasSarapan{
    public static void main(String[] args){
        int totalBiaya = 0;
        int pilihanMenu;
        double hargaMakanan;
        Scanner input = new Scanner(System.in);

        pilihanMenu = input.nextInt();
       
        
        // Pekerjaan anda dimulai dari sini
        
         switch (pilihanMenu) {
            case 1:
                hargaMakanan = 10000;
                break;
            case 2:
                hargaMakanan = 15000;
                break;
            case 3:
                hargaMakanan = 20000;
                break;
            default:
                hargaMakanan = 12000;
        }

        for (int i = 1; i <= 7; i++) {
            if(i == 6 || i ==7){
               if(hargaMakanan >= 15000){
                    hargaMakanan = hargaMakanan * 0.9;
               }
               else if(hargaMakanan >= 11000){
                    hargaMakanan = hargaMakanan * 0.95;
               }
               else{
                    hargaMakanan = hargaMakanan;
               }
               
            }
            totalBiaya += hargaMakanan;
        }

        //Pekerjaan anda berakhir disini
        
        System.out.println(totalBiaya);
    }
}
