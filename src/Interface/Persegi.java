/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Arya Permana PY
 */
public class Persegi extends SuperBentuk implements Shape{

    @Override
    public void cetak() {
       
    }

    @Override
    public double luas() {
        super.sisi = 5;
        return super.sisi * super.sisi;
    }

    @Override
    public double keliling() {
        super.sisi = 5;
        return super.sisi * 4;
    }
    
}
