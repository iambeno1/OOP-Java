public class Data {
    public int intPublic;
    private int intPrivate;
    private double doblPrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    // Getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // Setter
    public void setDblPrivate(double value){
        this.doblPrivate = value;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doblPrivate);
    }
}
