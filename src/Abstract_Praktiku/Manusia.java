/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Praktiku;

/**
 *
 * @author Arya Permana PY
 */
abstract public class Manusia {
    public double tinggiBadan;
    
    
    public Manusia(double TB) {
    tinggiBadan = TB;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }
    
    abstract public double HtgBB();
    
    
}