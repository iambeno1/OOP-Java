public class App {
    public static void main(String[] args) throws Exception {
        var parentName = new Parent();
        parentName.name = "Budi (Parent)";
        parentName.sayHello("Andi");

        var childName = new Child();
        childName.name = "Bob (Child)";
        childName.sayHello("Joko");
        
        Overriding overriding = new Overriding();
        overriding.name = "June";
        overriding.sayHello("Duke");

    }
}
