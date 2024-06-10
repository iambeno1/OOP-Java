package polymorphism;

public class Manager extends Employee {

    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello MGR " + this.name + ", my name is " + name);
    }
}
