/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package citilink;

/**
 *
 * @author Arya Permana PY
 */
public class LionAir extends Tiket
{
    private String nomorPesawat;
    private String tujuan;
    private String noKursi;
    private int harga;
    private int jumlah;
    
    public LionAir (String nomorPesawat,String tujuan,String noKursi,int jumlah,String nik,String nama,String jk,String bookingID,String tgl_berangkat,String tgl_kembali,String bandaraAsal) {
        super(nik, nama, jk, bookingID, tgl_berangkat, tgl_kembali, bandaraAsal);
        this.nomorPesawat = nomorPesawat;
        this.tujuan = tujuan;
        this.noKursi = noKursi;
        this.jumlah = jumlah;
    }
    
    public String getNomorPesawat() {
        return this.nomorPesawat;
    }
    
    public int getJumlah() {
        return this.jumlah;
    }
    
    public String getTujuan() {
        return this.tujuan;
    }
    
    public String getNoKursi() {
        return this.noKursi;
    }
    
    public int getHarga() {
        if (super.getBandaraAsal().equalsIgnoreCase("Surabaya")) {
            if (this.getTujuan().equalsIgnoreCase("Bali") || this.getTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 500000;
            }
            else if (this.getTujuan().equalsIgnoreCase("Jakarta") || this.getTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 600000;
            }
            else if (this.getTujuan().equalsIgnoreCase("Balikpapan") || this.getTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 700000;
            }
            else {
                System.out.println("Rute tidak tersedia");
            }
        }
        else if (super.getBandaraAsal().equalsIgnoreCase("Jakarta")) {
            if (this.getTujuan().equalsIgnoreCase("Bali") || this.getTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 700000;
            }
            else if (this.getTujuan().equalsIgnoreCase("Surabaya") || this.getTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 750000;
            }
            else if (this.getTujuan().equalsIgnoreCase("Balikpapan") || this.getTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 800000;
            }
            else {
                System.out.println("Rute tidak tersedia");
            }
        }
        return this.harga;
    }
    
    int getTotal() {
        return this.getHarga() * this.getJumlah();
    }
}
