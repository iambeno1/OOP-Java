package polymorphism;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void  sayHello(String name){
        System.out.println("Hello Employee " + this.name + ", my name is " + name);
    }
}
