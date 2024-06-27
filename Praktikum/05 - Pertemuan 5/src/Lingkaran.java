public class Lingkaran {
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // Setter
    public void setJari2(double jari2){
        this.diameter = jari2;
    }

    // Getter
    public double getJari2(){
        return this.diameter/2;
    }

    // Getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}
