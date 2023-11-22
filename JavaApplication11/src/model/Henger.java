
package model;



public class Henger {
   static private int hengerDarab;
   private double magassag,sugar;

    public Henger(double magassag, double sugar) {
        this.magassag = magassag;
        this.sugar = sugar;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getMagassag() {
        return magassag;
    }

    public double getSugar() {
        return sugar;
    }
 public double terfogat(){
     double terfogat = 2;
     return terfogat;
 }
    @Override
    public String toString() {
        return "Henger{" + "magassag=" + magassag + ", sugar=" + sugar + '}';
    }
    
   
    
}
