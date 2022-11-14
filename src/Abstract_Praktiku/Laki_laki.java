/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Praktiku;

/**
 *
 * @author Arya Permana PY
 */
public class Laki_laki extends Manusia{

    public Laki_laki(double TB) {
        super(TB);
    }

    @Override
    public double HtgBB() {
        return (getTinggiBadan() - 100) * 0.9;
    }
    
   
}
