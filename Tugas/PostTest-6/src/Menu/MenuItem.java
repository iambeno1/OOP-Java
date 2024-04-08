package Menu;

public class MenuItem {
    private String ID;
    private String namaMakanan;
    private double harga;

    // ======== Setter dan Getter untuk atribut ID ======== 
    public void setID(String ID){
        this.ID = ID;
    }
    
    public String getID(){
        return this.ID;
    }
    
    // ======== Setter dan Getter untuk atribut namaMakanan ======== 
    public void setNamaMakanan(String namaMakanan){
        this.namaMakanan = namaMakanan;
    }
    
    public String getNamaMakanan(){
        return this.namaMakanan;
    }
    
    // ======== Setter dan Getter untuk atribut namaMakanan ======== 
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double getHarga(){
        return this.harga;
    }

}
