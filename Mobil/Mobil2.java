package Mobil;

/**
 *
 * Andi Prabandaru
 * A11.2021.13907
 */

public class Mobil2 {
    int gear = 0;
    
    
    public void hidupkanMobil(){
        System.out.println("Menyalakan mesin mobil.");
    }
    
   public void ubahGigi(int newGear){
       gear += newGear;
       
       System.out.println("Gear = " + gear);
   }
   
   public void matikanMobil(){
       System.out.println("Mematikan mesin mobil.");
   }
}
