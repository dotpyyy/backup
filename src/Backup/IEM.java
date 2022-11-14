/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Backup;

/**
 *
 * @author Arya Permana PY
 */
public class IEM implements Barang {
    public String namabarang;
    public String signature;
    public String comments;
    public int harga;
    public int kodebarang;

    public IEM(String namabarang, String signature, String comments, int harga, int kodebarang) {
        this.namabarang = namabarang;
        this.signature = signature;
        this.comments = comments;
        this.harga = harga;
        this.kodebarang = kodebarang;
    }

    public int getKodebarang() {
        return kodebarang;
    }
    
    
    public String getNamabarang() {
        return namabarang;
    }

    public String getSignature() {
        return signature;
    }

    public String getComments() {
        return comments;
    }

    public int getHarga() {
        return harga;
    }

    @Override
    public void pilihbarang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public void detailbarang() {
        
    }

    @Override
    public void totalharga() {
        
    }

    @Override
    public int harga() {
        
    return 0;
    }

    @Override
    public void print() {
    
    }

    @Override
    public int kodebarang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

