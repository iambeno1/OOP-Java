package inheritance;

public class Main {
    public static void main(String[] args) throws Exception {


        // Inherittance / Pewarisan (Parent & Child)
        // Ini parent
        Parent myParent = new Parent();
        myParent.name = "Gusti";
        myParent.sayHello(  "Junior");


        // Ini Child
        Child myChild = new Child();
        myChild.name = "Junior";
        myChild.sayHello(myParent.name);


    }
}
