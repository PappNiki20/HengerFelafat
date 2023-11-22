
package model;

public class Cso extends TomorHenger{
    private double favastagsag;

    public Cso(double favastagsag, double fajsuly, double magassag, double sugar) {
        super(fajsuly, magassag, sugar);
        this.favastagsag = favastagsag;
    }

    public Cso(double favastagsag, double sugar, double magassag) {
        super(sugar, magassag);
        this.favastagsag = favastagsag;
    }

    public double getFavastagsag() {
        return favastagsag;
    }
    @Override
    public double terfogat(){
        double ter = 1;
        return ter;
    }
    @Override
    public String toString() {
        return "Cso{" + "favastagsag=" + favastagsag + '}';
    }
    
}
