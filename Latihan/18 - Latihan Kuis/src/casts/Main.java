package casts;

public class Main {
    public static void main(String[] args) {
        VicePrecident vp = new VicePrecident("Rony");
        vp.sayHello("Budi");

        Employee employee = new Employee("k");
        employee.sayHello("Jhon");

        employee = new Manager("akdf");
        employee.sayHello("Joko");

        employee = new VicePrecident("ka");
        employee.sayHello(null);

        System.out.println(employee instanceof VicePrecident);

        sayHello(new Employee("Joko"));
        sayHello(new Manager("Budi"));
        sayHello(new VicePrecident("Otong"));

    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePrecident){
            VicePrecident vp = (VicePrecident) employee;
            System.out.println("Hello vp : " + vp.name);
        }else if(employee instanceof Manager){
            Manager mgr = (Manager) employee;
            System.out.println("Hello manager : " + mgr.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }
}
