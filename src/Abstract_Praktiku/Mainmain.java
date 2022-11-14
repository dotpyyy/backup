/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstract_Praktiku;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;
public class Mainmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     double kekw = 0;
    
        
        System.out.println("Masukkan Tinggi Badan: ");
        kekw = Double.parseDouble(br.readLine());
        
        System.out.println("Pilih Jenis Kelamin");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        int pilih = Integer.parseInt(br.readLine());
        Manusia m = new Laki_laki(kekw);
        Manusia p = new Perempuan(kekw);
        
        if (pilih == 1) {
        new Laki_laki (kekw);
        System.out.println("Berat Badan Laki-Laki: " + m.HtgBB());
        }
        else {
        new Perempuan (kekw);
        Manusia[] k = new Manusia[2];
        System.out.println("Berat Badan Perempuann: " + p.HtgBB());
        }
        
}
}
