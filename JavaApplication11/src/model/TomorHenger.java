
package model;

public class TomorHenger extends Henger{
    private double fajsuly;

    public TomorHenger(double fajsuly, double magassag, double sugar) {
        super(magassag, sugar);
        this.fajsuly = fajsuly;
    }
    public TomorHenger(double sugar, double magassag){
        this(1.0,2,3);
    }

    public double getFajsuly() {
        return fajsuly;
    }
   public double suly(){
       double suly = 0;
       return suly;
   }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
   
}
