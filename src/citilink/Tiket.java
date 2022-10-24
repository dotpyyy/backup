/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citilink;

/**
 *
 * @author Arya Permana PY
 */
public class Tiket
{
    private String nik;
    private String nama;
    private String jk;
    private String bookingID;
    private String bandaraAsal;
    private String tgl_berangkat;
    private String tgl_kembali;
    
    public Tiket(String nik,String nama,String jk,String bookingID,String tgl_berangkat,String tgl_kembali,String bandaraAsal) {
        this.nik = nik;
        this.nama = nama;
        this.jk = jk;
        this.bookingID = bookingID;
        this.tgl_berangkat = tgl_berangkat;
        this.tgl_kembali = tgl_kembali;
        this.bandaraAsal = bandaraAsal;
    }
    
    public String getNik() {
        return this.nik;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getJk() {
        return this.jk;
    }
    
    public String getBookingID() {
        return this.bookingID;
    }
    
    public String getTgl_berangkat() {
        return this.tgl_berangkat;
    }
    
    public String getTgl_kembali() {
        return this.tgl_kembali;
    }
    
    public String getBandaraAsal() {
        return this.bandaraAsal;
    }
}