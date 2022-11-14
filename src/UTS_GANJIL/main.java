/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_GANJIL;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;

public class main
{
    /// Nama: Arya Permana Putera Yuscandra
    /// NIM: 21410100025
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        barang brg = new barang(null, null, 0,0);
        minuman minum = new minuman(null, 0,0,0,null,null,0,0);
        int total = 0;
        while (true) {
            System.out.println("-- Menu Toko Kita --");
            System.out.println("1. Entry Data Barang");
            System.out.println("2. Entry Data Penjualan");
            System.out.println("3. Keluar");
            int pick = Integer.parseInt(br.readLine());
            System.out.println("");
            switch (pick) {
                case 1: {
                    System.out.println("Entry Data Barang");
                    brg.entriData();
                    continue;
                    }
                    
                case 2: {
                   continue;
                    }
                
                case 3: {
                    System.exit(0);
                    continue;
                }
            }
        }
    }
}
