package superconstructor;

public class Main {
    public static void main(String[] args) throws Exception {


        // Inherittance / Pewarisan (Parent & Child)
        // Ini parent
        Parent myParent = new Parent("Gusti");
        myParent.sayHello(  "Junior");


        // Ini Child
        Child myChild = new Child("Junior");
        myChild.sayHello(myParent.name);


    }
}
