/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citilink;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;

public class MainClass
{
    /// Nama: Arya Permana Putera Yuscandra
    /// NIM: 21410100025
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tglKmbli = null;
        int total = 0;
        while (true) {
            System.out.println("-- Pemesanan Barang --");
            System.out.print("Masukkan jumlah penumpang: ");
            int jumlah = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.print("Kota Asal : ");
            String asal = br.readLine();
            System.out.println("\n Pilihan rute tujuan: \n Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
            System.out.print("Tujuan : ");
            String tujuan = br.readLine();
            System.out.print("Tanggal Berangkat : ");
            String tglBrkt = br.readLine();
            System.out.print("Pesan pulang-pergi? (Y/N) : ");
            String konfirmasi = br.readLine();
            if (konfirmasi.equalsIgnoreCase("Y")) {
                System.out.print("Tanggal kembali : ");
                tglKmbli = br.readLine();
            }
            System.out.println("");
            System.out.println("-- Pilih Maskapai --");
            System.out.println("1. Lion Air");
            System.out.println("2. Citilink");
            System.out.print("Pilih maskapai : ");
            int maskapai = Integer.parseInt(br.readLine());
            System.out.println("");
            LionAir[] lion = new LionAir[jumlah];
            Citilink[] citilink = new Citilink[jumlah];
            switch (maskapai) {
                case 1: {
                    System.out.println("-- Selamat datang di Lion Air --");
                    System.out.println("Silahkan isi data penumpang");
                    for (int i = 0; i < lion.length; ++i) {
                        System.out.print("Booking ID : ");
                        String bookingID = br.readLine();
                        System.out.print("NIK : ");
                        String nik = br.readLine();
                        System.out.print("Nama : ");
                        String nama = br.readLine();
                        System.out.print("Jenis kelamin (P/L) : ");
                        String jk = br.readLine();
                        System.out.print("No pesawat : ");
                        String noPswt = br.readLine();
                        System.out.print("No kursi : ");
                        String noKursi = br.readLine();
                        lion[i] = new LionAir(noPswt, tujuan, noKursi, jumlah, nik, nama, jk, bookingID, tglBrkt, tglKmbli, asal);
                        System.out.println("");
                    }
                    for (int i = 0; i < lion.length; ++i) {
                        System.out.println(" Preview Tiket LION AIR");
                        System.out.println("=========================");
                        System.out.println("Booking ID : " + lion[i].getBookingID());
                        System.out.println("NIK : " + lion[i].getNik());
                        System.out.println("Nama : " + lion[i].getNama() + "/ " + lion[i].getJk());
                        System.out.println("Kota Asal : " + lion[i].getBandaraAsal());
                        System.out.println("Kota Tujuan : " + lion[i].getTujuan());
                        System.out.println("Tanggal berangkat : " + lion[i].getTgl_berangkat());
                        System.out.println("Tanggal kembali : " + lion[i].getTgl_kembali());
                        System.out.println("Nomor pesawat : " + lion[i].getNomorPesawat());
                        System.out.println("Nomor kursi : " + lion[i].getNoKursi());
                        System.out.println("Harga tiket : " + lion[i].getHarga());
                        total = lion[i].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.out.print("Pesan lagi? (Y/N) : ");
                    konfirmasi = br.readLine();
                    if (konfirmasi.equalsIgnoreCase("n")) {
                        System.exit(0);
                        continue;
                    }
                    continue;
                }
                case 2: {
                    System.out.println("-- Selamat datang di Citilink --");
                    System.out.println("Silahkan isi data penumpang");
                    for (int i = 0; i < citilink.length; ++i) {
                        System.out.print("Booking ID : ");
                        String bookingID = br.readLine();
                        System.out.print("NIK : ");
                        String nik = br.readLine();
                        System.out.print("Nama : ");
                        String nama = br.readLine();
                        System.out.print("Jenis kelamin (P/L) : ");
                        String jk = br.readLine();
                        System.out.print("No pesawat : ");
                        String noPswt = br.readLine();
                        System.out.print("No kursi : ");
                        String noKursi = br.readLine();
                        citilink[i] = new Citilink(noPswt, tujuan, noKursi, jumlah, nik, nama, jk, bookingID, tglBrkt, tglKmbli, asal);
                        System.out.println("");
                    }
                    for (int i = 0; i < citilink.length; ++i) {
                        System.out.println("Preview Tiket CITILINK");
                        System.out.println("=========================");
                        System.out.println("Booking ID : " + citilink[i].getBookingID());
                        System.out.println("NIK : " + citilink[i].getNik());
                        System.out.println("Nama : " + citilink[i].getNama() + "/ " + citilink[i].getJk());
                        System.out.println("Kota Asal : " + citilink[i].getBandaraAsal());
                        System.out.println("Kota Tujuan : " + citilink[i].getTujuan());
                        System.out.println("Tanggal berangkat : " + citilink[i].getTgl_berangkat());
                        System.out.println("Tanggal kembali : " + citilink[i].getTgl_kembali());
                        System.out.println("Nomor pesawat : " + citilink[i].getNomorPesawat());
                        System.out.println("Nomor kursi : " + citilink[i].getNoKursi());
                        System.out.println("Harga tiket : " + citilink[i].getHarga());
                        total = citilink[i].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.out.print("Pesan lagi? (Y/N) : ");
                    konfirmasi = br.readLine();
                    if (konfirmasi.equalsIgnoreCase("n")) {
                        System.exit(0);
                        continue;
                    }
                    continue;
                }
                case 3: {
                    System.exit(0);
                    continue;
                }
            }
        }
    }
}