/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backup;

/**
 *
 * @author Arya Permana PY
 */
public class Midgame extends IEM implements Barang{

    public Midgame(String namabarang, String signature, String comments, int harga, int kodebarang) {
        super(namabarang, signature, comments, harga, kodebarang);
    }

    @Override
    public int harga() {
        return getHarga();
    }

    @Override
    public void totalharga() {
        super.totalharga(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void pilihbarang() {
        System.out.println("1. Moondrop Aria");
        System.out.println("2. DUNU Titan S");
        System.out.println("3. Moondrop Kato");
    }

    @Override
    public void detailbarang() {
        System.out.println("Nama Barang: " +getNamabarang());
        System.out.println("Signature: " +getSignature());
        System.out.println("Comments: " +getComments());
        System.out.println("Harga: " +getHarga());
    }

    @Override
    public int getHarga() {
       if (super.getKodebarang() == 1) {
            return 1100000;
        }
        else if (super.getKodebarang() == 2) {
            return 1300000;
        }
        else if (super.getKodebarang() == 3) {
            return 2500000;
        }
        else {
            return 0;
        }
    }

    @Override
    public String getComments() {
       if (super.getKodebarang() == 1) {
            return "Well-tuned single DD with proper timbre and decent technicalities.";
        }
        else if (super.getKodebarang() == 2) {
            return "Good Stuff";
        }
        else if (super.getKodebarang() == 3) {
            return "Well-tuned single DD with proper timbre and decent technicalities.";
        }
        else {
            return "";
        }
    }

    @Override
    public String getSignature() {
        if (super.getKodebarang() == 1) {
            return "Harman-neutral";
        }
        else if (super.getKodebarang() == 2) {
            return "Mild V-shape";
        }
        else if (super.getKodebarang() == 3) {
            return "Harman-neutral";
        }
        else {
            return "";
        }
    }

    @Override
    public String getNamabarang() {
        if (super.getKodebarang() == 1) {
            return "Moondrop Aria";
        }
        else if (super.getKodebarang() == 2) {
            return "DUNU Titan S";
        }
        else if (super.getKodebarang() == 3) {
            return "Moondrop Kato";
        }
        else {
            return "";
        }
    }

    @Override
    public int kodebarang() {
        return super.kodebarang(); 
    }
    
    
    public void print() {
     
     System.out.println("Nama Barang: " +getNamabarang());
     System.out.println("Signature: " +getSignature());
     System.out.println("Comments: " +getComments());
    }
}

