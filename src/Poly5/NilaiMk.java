/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poly5;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;

public class NilaiMk {

    public String nim, nama;
    int uts, uas, tugas;

    public NilaiMk(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // fungsi berpearameter -> overiding method
    public int hitungNilai(int uts, int uas, int tugas) {
        return ((uts * 30 / 100) + (uas * 30 / 100) + (tugas * 40 / 100));
    }

    // overloading method
    // inputan user
    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        System.out.print("NIM : ");
        nim = br.readLine();
        System.out.print("NAMA : ");
        nama = br.readLine();

        System.out.println("Ini adalah method get data tanpa parameter : " + nim + " | " + nama);
    }

    void getData(String Ndosen) throws IOException {
        // input
        getData();
        main.cetakSpasi(1);

        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nama Dosen Wali : " + Ndosen);

        System.out.println("Ini adalah method get data dengan parameter : " + nim + " | " + nama);
    }

    public void getNilai() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan nilai uts : ");
        uts = Integer.parseInt(br.readLine());
        System.out.print("Masukan nilai uas : ");
        uas = Integer.parseInt(br.readLine());
        System.out.print("Masukan nilai Tugas : ");
        tugas = Integer.parseInt(br.readLine());

        hitungNilai(uts, uas, tugas);
    }

}