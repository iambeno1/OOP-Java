package polymorphism;

public class Main {
    public static void main(String[] args) {
        // Parent dari VicePresident
        Manager mngr = new Manager("Budi");
        mngr.sayHello("Joko");

        // Child nya Manager
        VicePrecident vp = new VicePrecident("Otong");
        vp.sayHello("Ucup");

        // Polymorphism (berubah bentuk ke objek lain)
        Employee employee = new Employee("HR");
        employee.sayHello("Rudy");
        
        employee = new Manager(mngr.name);
        employee.sayHello("Rudy");
        employee = new VicePrecident(vp.name);
        employee.sayHello("Rudy");

        // Polymorphism juga bisa begini

        sayHello(new Employee("Budi"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePrecident("null"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
