/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package interhiritance;

/**
 *
 * @author Arya Permana PY
 */
public class super_class {

    private String nama, keterangan;

    // Constructor

    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    // Super

    public void cetak() {
        System.out.print(getNama() + " " + getKeterangan());
    }

    public void halo() {
        System.out.print("Halo!");
    }
}