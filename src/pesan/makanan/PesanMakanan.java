/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesan.makanan;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class PesanMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  jumlah, total = 0, bayar , kembalian = 0;
        int potongan1, potongan2, potongan3;
        
        String[] menuMakanan = {"AYAM GORENG", "AYAM PENYET", "AYAM BAKAR", 
                                "LELE GORENG", "LELE BAKAR", "NILA GORENG",
                                "NILA BAKAR" }; 
        int[] harga = {10000, 10000, 10000, 8000, 8000, 10000, 10000};
        
        for(int i = 0; i < menuMakanan.length; i++){
            System.out.println(i + ". " + menuMakanan[i]);
        }
        System.out.println("\n====================================================");
        System.out.print (" Pilih makanan : ");
        int pilih = input.nextInt();
        System.out.println(menuMakanan[pilih]);
        
        System.out.print (" Jumlah Barang : ");
        jumlah = input.nextInt();
        System.out.println(menuMakanan[jumlah]);
        
        total = harga[pilih]*jumlah;
        System.out.println("\n====================================================");
        System.out.println("Total Bayar : Rp "+ total);
        
        
        if(total >= 50000){
        System.out.println("Total Bayar (Diskon 15%) : Rp "+ (total-(15/100f*total)));
        }else if(total >= 40000 ){
        System.out.println("Total Bayar (Diskon 10%) : Rp "+ (total-(10/100f*total)));
        }else if(total >= 30000){
        System.out.println("Total Bayar (Diskon 5%) : Rp "+ (total-(5/100f*total)));
        }
        
        System.out.println("\n====================================================");
        System.out.print("masukan jumlah pembayaran : " );
        bayar = input.nextInt();
        
        if(bayar > total){
            System.out.println("Total kembalian :  "+ bayar + "-" + total + "=" +(bayar-total));
        }else if(bayar == total){
            System.out.println("Uang anda pas, Silahkan Menikmati ");
        }else if(bayar < total ){
        System.out.println("###mohon maaf uang anda tidak cukup untuk membayar semuanya###");
        }
                

    }
    
}
