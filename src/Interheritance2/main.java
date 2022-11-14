/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interheritance2;

/**
 *
 * @author Arya Permana PY
 */
import java.io.*;
public class main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        barang brg = new barang(null, null, null,null);
        minuman minum = new minuman(null, null);
        cetakSpasi(2);

        String id, name, address, title;

        // Declare Length

        // Array Object

        try {
            System.out.print("Masukan Length : ");
            int length = Integer.parseInt(br.readLine());
            employee y[] = new employee[length];
            cetakSpasi(2);
            // input
            for (int i = 0; i < y.length; i++) {
                System.out.println("#### INPUT ####");
                System.out.print("Entry ID\t: ");
                id = br.readLine();
                System.out.print("Entry name\t: ");
                name = br.readLine();
                System.out.print("Entry Address\t: ");
                address = br.readLine();
                System.out.println("Entry Department : IT");
                System.out.print("Entry Title\t: ");
                title = br.readLine();
                cetakSpasi(2);

                // Input
                y[i] = new employee(id, name, address, null, title);

            }
            cetakSpasi(2);

            // output
            for (int i = 0; i < y.length; i++) {
                System.out.println("#### Rows " + (i + 1) + " ####");
                y[i].getDataRows();
                cetakSpasi(2);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void cetakSpasi(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println();
        }
    }
}
