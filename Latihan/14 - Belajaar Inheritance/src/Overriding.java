public class Overriding extends Parent {
    // Class Overriding disini adalah child dari class Parent
    // Method overriding adalah kemampuan child dalam memodifikasi ulang method yang dimiliki oleh parent (mirip dengan method overloading)
    
    void sayHello(String name){
        System.out.println("Halo " + name + ", saya Overriding " + this.name);
    }
}
