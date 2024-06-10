package superconstructor;

public class Child extends Parent {

    Child(String name){
        super(name);

    }

    @Override
    public void sayHello(String name){
        System.out.println("Hello [Child] " + this.name + ", my name is " + name);
    }
}
