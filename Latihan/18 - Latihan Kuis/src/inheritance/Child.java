package inheritance;

public class Child extends Parent {

    @Override
    public void sayHello(String name){
        System.out.println("Hello [Child] " + this.name + ", my name is " + name);
    }
}
