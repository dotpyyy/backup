/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_GANJIL;

import java.io.IOException;

/**
 *
 * @author Arya Permana PY
 */
public class minuman extends barang
{
    private String jenis;
    private int jumlahBeli;
    private int total;
    private int diskon;
    
    public minuman() {
        
    }
    
    public minuman(String jenis,int jumlahBeli,int total,int diskon, String kodeBarang, String namaBarang, int harga, int stok) {
        super(kodeBarang, namaBarang,harga,stok);
        this.jenis = jenis;
        this.jumlahBeli = jumlahBeli;
        this.total = total;
        this.diskon = diskon;
    }

    public String getJenis() {
        return jenis;
    }
    
    
    int total() {
        return this.getHarga();
    }
    int diskon() {
        return this.getHarga();
    }

    @Override
    public int StokUpdate() {
        return super.StokUpdate();
    }

    @Override
    public void entriData(String kodeBarang, String namaBarang, int harga, int stok) throws NumberFormatException, IOException {
        super.entriData(kodeBarang, namaBarang, harga, stok);
    }

    @Override
    public void entriData() throws NumberFormatException, IOException {
        super.entriData();
    }

    
    void struk() throws IOException {

        System.out.println("Kode Barang: " + getKodeBarang());
        System.out.println("Nama Barang : " + getNamaBarang());
        System.out.println("Harga Barang : " + getHarga());
    }
   
}