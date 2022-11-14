/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Praktiku;

/**
 *
 * @author Arya Permana PY
 */
public class Perempuan extends Manusia{

    public Perempuan(double TB) {
        super(TB);
    }

    @Override
    public double HtgBB() {
        return (getTinggiBadan() - 100) * 0.8;
    }
    
}
