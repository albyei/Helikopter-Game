/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helikopergame;

/**
 *
 * @author MOLKET012
 */
public class HelikoperGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Helikoper helikopter = new Helikoper();
        
        helikopter.energi= 12;
        helikopter.terbang();
        
        helikopter.energi= 11;
        helikopter.marikanmesin();
        
        helikopter.ketinggian= 11;
        helikopter.energi= 11;
        helikopter.turun();
        
        helikopter.energi= 11;
        helikopter.belok();
        
        helikopter.energi= 5;
        helikopter.maju();
        helikopter.kecepatan= 6;
        
        helikopter.energi= 4;
        helikopter.mundur();
        helikopter.kecepatan= 12;
    }
    
}
