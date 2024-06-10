package superconstructor;

public class Parent {
    public String name;

    Parent(String name){
        this.name = name;

    }

    public void sayHello(String name){
        System.out.println("Hello " + this.name + ", my name is " + name);
    }
}
