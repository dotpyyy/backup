/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Poly5;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {

        int uts, uas, tugas;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Object
        NilaiMk nmk = new NilaiMk(null, null);
        NilaiMk npbo = new NilaiPBO(null, null);

        // memanggil overloading method (NMK)
        cetakSpasi(1);
        nmk.getData("Pradita");

        // memanggil overriding method (NPBO)
        cetakSpasi(2);
        System.out.println("Ini overriding method");

        npbo.getNilai();

    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}