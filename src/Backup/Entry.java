/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backup;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;
public class Entry extends IEM implements Barang{

    public Entry(String namabarang, String signature, String comments, int harga, int kodebarang) {
        super(namabarang, signature, comments, harga, kodebarang);
    }

    @Override
    public int harga() {
       return getHarga();
    }

    @Override
    public void totalharga ()  { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    super.totalharga();
    
    
    }

    @Override
    public void pilihbarang() {
        System.out.println("1. Moondrop Chu");
        System.out.println("2. Tanchjim Ola");
        System.out.println("3. Moondrop SSP");
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
            return 300000;
        }
        else if (super.getKodebarang() == 2) {
            return 550000;
        }
        else if (super.getKodebarang() == 3) {
            return 600000;
        }
        else {
            return 0;
        }
    }

    @Override
    public String getComments() {
       if (super.getKodebarang() == 1) {
            return "An extremely well-tuned neutral IEM with a slightly bright and metallic tilt.";
        }
        else if (super.getKodebarang() == 2) {
            return "An extremely well-tuned neutral IEM with a slightly bright and metallic tilt.";
        }
        else if (super.getKodebarang() == 3) {
            return "Extra bass on top of the SSR does help it a little, but also results in a more hollow presentation.	";
        }
        else {
            return "";
        }
    }

    @Override
    public String getSignature() {
        if (super.getKodebarang() == 1) {
            return "Neutral";
        }
        else if (super.getKodebarang() == 2) {
            return "Neutral";
        }
        else if (super.getKodebarang() == 3) {
            return "Warm DF-neutral";
        }
        else {
            return "";
        }
    }

    @Override
    public String getNamabarang() {
        if (super.getKodebarang() == 1) {
            return "Moondrop Chu";
        }
        else if (super.getKodebarang() == 2) {
            return "Tancjim Ola";
        }
        else if (super.getKodebarang() == 3) {
            return "Moondrop SSP";
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

