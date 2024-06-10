package polymorphism;

public class VicePrecident extends Manager {

    VicePrecident(String name){
        super(name);
    }
    
    @Override
    void sayHello(String name){
        System.out.println("Hello VP " + this.name + ", my name is " + name);
    }
}
