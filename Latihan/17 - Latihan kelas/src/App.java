public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Parent p = new Parent();
        Child c = new Child();


        System.out.println("p instanceof Parent: " + (p instanceof Parent));
        System.out.println("c instanceof Child: " + (c instanceof Child));
        System.out.println("c instanceof Child: " + (c instanceof Parent));
        System.out.println("p instanceof Child: " + (p instanceof Child));
    }
}
