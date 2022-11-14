/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstacttugas;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;
public class MAINMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int kode = 0;
    
        Barang kek = new Endgame(null,null,null,0,0);
        kek.pilihbarang();
       System.out.println("Pilih Barang yang akan dibeli");
       
        kode = Integer.parseInt(br.readLine());
        Barang end = new Endgame(null, null, null, 0, kode);
        end.detailbarang();
        
        end.print();
        
        
}
}
