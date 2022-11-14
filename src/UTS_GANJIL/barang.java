/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_GANJIL;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;
public class barang
{
    private String kodeBarang;
    private String namaBarang;
    private int harga;
    private int stok;

    public barang() {
    }
    
    public barang(String kodeBarang, String namaBarang, int harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    
    public int StokUpdate() {
        
        
        return this.stok;
    }
    public void entriData() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan Kode Barang : ");
        kodeBarang = br.readLine();
        System.out.print("Masukan nama baranng : ");
        namaBarang = br.readLine();
        System.out.print("Masukan harga barang : ");
        harga = Integer.parseInt(br.readLine());
        System.out.print("Masukan stok barang : ");
        stok = Integer.parseInt(br.readLine());
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
        

    }

    public void entriData(String kodeBarang, String namaBarang, int harga, int stok) throws NumberFormatException, IOException {

    }
}