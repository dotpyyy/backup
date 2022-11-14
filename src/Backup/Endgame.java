/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Backup;

/**
 *
 * @author Arya Permana PY
 */
public class Endgame extends IEM implements Barang{

    public Endgame(String namabarang, String signature, String comments, int harga, int kodebarang) {
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
        System.out.println("1. ThieAudio Monarch Mk2");
        System.out.println("2. Sony IER-Z1R");
        System.out.println("3. 64 Audio A/U12t");
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
            return 14985000;
        }
        else if (super.getKodebarang() == 2) {
            return 20715000;
        }
        else if (super.getKodebarang() == 3) {
            return 30000000;
        }
        else {
            return 0;
        }
    }

    @Override
    public String getComments() {
       if (super.getKodebarang() == 1) {
            return "A clean-sounding monitor with a bass boost near-exclusively in the sub-frequencies.	";
        }
        else if (super.getKodebarang() == 2) {
            return "Extended yet natural treble, realistic sub-bass focus and spacious imaging capabilities.";
        }
        else if (super.getKodebarang() == 3) {
            return "Amazing bass (for a BA), top-tier resolution and detail-oriented signature.	";
        }
        else {
            return "";
        }
    }

    @Override
    public String getSignature() {
        if (super.getKodebarang() == 1) {
            return "Neutral with bass boost";
        }
        else if (super.getKodebarang() == 2) {
            return "Mild V-shape";
        }
        else if (super.getKodebarang() == 3) {
            return "Neutral with bass boost";
        }
        else {
            return "";
        }
    }

    @Override
    public String getNamabarang() {
        if (super.getKodebarang() == 1) {
            return "ThieAudio Monarch Mk2";
        }
        else if (super.getKodebarang() == 2) {
            return "Sony IER-Z1R";
        }
        else if (super.getKodebarang() == 3) {
            return "64 Audio A/U12t";
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

