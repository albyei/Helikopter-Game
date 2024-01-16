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
public class Helikoper {
    
    
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    
    void terbang(){
        energi--;
        if(energi >10){
            //helikopter terbang
        ketinggian++;
            System.out.println("Helikopter terbang  ");
        }else{
            System.out.println("Energi lemah...Helikoper tidak bisa terbang");
        }
    }
    void marikanmesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena Helikopter sedang terbang");
        }else{
            System.out.println("Mesin diMatikan..");
        }
    }
    void turun(){
        ketinggian--;
        energi--;
        System.out.println("Helikopter Sedang Turun");
    }
    
    void belok(){
        energi--;
        System.out.println("Helikoper Sedang Belok ");
    }
     void maju(){
        energi--;
        System.out.println("Helikoper Sedang Maju ");
    }
     void mundur(){
        energi--;
        System.out.println("Helikoper Sedang Mundur ");
     }
}


