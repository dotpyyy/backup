/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interhiritance;

/**
 *
 * @author Arya Permana PY
 */
public class sub extends super_class {

    private int tinggi;

    public sub(String nama, String keterangan, int tinggi) {
        super(nama, keterangan);
        this.tinggi = tinggi;
    }

    // Getter
    public int getTinggi() {
        return tinggi;
    }

    // custom
    public void dataLengkap() {
        System.out.print(super.getNama() + " " + super.getKeterangan() + " " + getTinggi());
    }

    @Override
    public void cetak() {
        super.cetak();
    }

    @Override
    public void halo() {
        super.halo();
    }
}
