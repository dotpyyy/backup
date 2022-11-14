/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Backup;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;
import java.time.LocalDate;
public class MAINMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     LocalDate myObj = LocalDate.now(); 
     
     int kode = 0;
     int pilihrange = 0;
     Barang iem = new IEM(null,null,null,0,0);
     Barang kek = new Endgame(null,null,null,0,0);
     Barang kek2 = new Entry(null,null,null,0,0);
     Barang kek3 = new Midgame(null,null,null,0,0);
        System.out.println("1. Entry Level (50$ <)");
        System.out.println("2. Mid Range (50$ >)");
        System.out.println("3. Flagship (1000$ >)");
        System.out.println("Piih Price Range:");
        pilihrange = Integer.parseInt(br.readLine());
        System.out.println("");
        if (pilihrange == 1 ) {
        kek2.pilihbarang();
        }
        else if (pilihrange == 2 ) {
        kek3.pilihbarang();
        }
        else if (pilihrange == 3 ) {
        kek.pilihbarang();
        }
 
       System.out.println("Pilih Barang yang akan dibeli:");
       kode = Integer.parseInt(br.readLine());
       System.out.println("");
       
        Barang end = new Endgame(null, null, null, 0, kode);
        Barang end2 = new Entry(null, null, null, 0, kode);
        Barang end3 = new Midgame(null, null, null, 0, kode);
        
        if (pilihrange == 1 ) {
        end2.detailbarang();
        end2.totalharga();
        }
        else if (pilihrange == 2 ) {
        end3.detailbarang();
        }
        else if (pilihrange == 3 ) {
        end.detailbarang();
        }
        
        System.out.println("");
        System.out.println("Pilih Pengiriman: ");    
        System.out.println("1. Reguler ");
        System.out.println("2. Express ");
        System.out.println("3. Nextday ");
        int pengiriman = Integer.parseInt(br.readLine());
        int ongkir = 0;
        if (pengiriman == 1) {
        ongkir = 10000;
        }
        else if (pengiriman == 2) {
        ongkir = 30000;
        }
        else if (pengiriman == 3) {
        ongkir = 50000;
        }
        System.out.println("============= Struk Pembelian =============");
        System.out.println("Tanggal Pembelian: " + myObj);
        System.out.println("===========================================");
        if (pilihrange == 1 ) {
        end2.print();
        System.out.println("Harga Barang: " + end2.harga());
        System.out.println("Ongkos kirim: " + ongkir);
        System.out.println("Total: " + (ongkir + end2.harga()));
        }
        else if (pilihrange == 2 ) {
        end3.print();
        System.out.println("Harga Barang: " + end3.harga());
        System.out.println("Ongkos kirim: " + ongkir);
        System.out.println("Total: " + (ongkir + end3.harga()));
        }
        else if (pilihrange == 3 ) {
        end.print();
        System.out.println("Harga Barang: " + end.harga());
        System.out.println("Ongkos kirim: " + ongkir);
        System.out.println("Total: " + (ongkir + end.harga()));
        }
  
        
        
        
}
}
