/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Constructor;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;

public class main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    protected static String inputU, inputP;

    // Object Instant
    protected static Akun admin = new Akun();
    protected static Akun akunBaru = new Akun();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try {
            do {
                // Menu
                cetakSpasi(2);
                System.out.println("I Gusti NGurah Aditya Kesuma - 21410100039");
                System.out.println("#### Menu ####");
                System.out.println("[1]. Login Admin");
                System.out.println("[2]. Buat Akun Baru");
                System.out.println("[3]. Lihat Akun");
                System.out.println("[4]. Ubah Password");
                System.out.println("[5]. Keluar");
                System.out.print("Masukan Inputan : ");
                int input = Integer.parseInt(br.readLine());

                switch (input) {
                    // Login admin
                    case 1:
                        cetakSpasi(2);
                        System.out.println("#### LOGIN ADMIN ####");
                        System.out.println("+++++++++++++++++++++++++++++++++");
                        System.out.print("Username : ");
                        inputU = br.readLine();
                        System.out.print("Password : ");
                        inputP = br.readLine();
                        // Mencocokan username dan password
                        if (inputU.equalsIgnoreCase(admin.getUsername()) && inputP.equals(admin.getPasswords())) {
                            System.out.println("Sukses!");
                        } else {
                            System.err.println("Gagal!");
                        }
                        break;

                    // Buat akun baru
                    case 2:
                        cetakSpasi(2);
                        System.out.println("#### BUAT AKUN BARU ####");
                        System.out.print("Username : ");
                        inputU = br.readLine();
                        System.out.print("Password : ");
                        inputP = br.readLine();

                        // Masukan ke Konstruktor;
                        akunBaru = new Akun(inputU, inputP);
                        break;

                    // Lihat AKun
                    case 3:
                        cetakSpasi(2);
                        System.out.println("#### LIHAT AKUN ####");
                        System.out.println("[1]. Admin");
                        System.out.println("Username : " + admin.getUsername());
                        System.out.println("Password : " + admin.getPasswords());
                        cetakSpasi(1);
                        System.out.println("[2]. Akun Baru");
                        System.out.println("Username : " + akunBaru.getUsername());
                        System.out.println("Password : " + akunBaru.getPasswords());
                        break;
                    // Ubah Akun
                    case 4:
                        String temp;
                        int index = 1;
                        cetakSpasi(2);
                        System.out.println("#### UBAH PASSWORD ####");

                        // Checking
                        do {
                            System.out.print("\n### Langkah 1 ####");
                            System.out.print("\ntry : " + index + "\n");
                            System.out.print("Masukan Password lama [0 = Back] : ");
                            temp = br.readLine();
                            if (temp.equals("0")) {
                                // break;
                                index = 0;
                                menu();
                            }
                            index++;
                        } while (!akunBaru.getUsername().equals(temp));
                        // Password Baru
                        System.out.println("### Password Benar ###");
                        System.out.print("Masukan Password Baru : ");
                        temp = br.readLine();
                        // masuk ke Setter
                        akunBaru.setPassword(temp);
                        System.out.println("### Password Berhasil dirubah ###");
                        //
                        index = 0;
                        break;
                    // Exit
                    case 5:
                        cetakSpasi(2);
                        System.out.println("SYSTEM EXITING...");
                        System.exit(0);
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Error catch");
        }
    }

    // Func
    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}
