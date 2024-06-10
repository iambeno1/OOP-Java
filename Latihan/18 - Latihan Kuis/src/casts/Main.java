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

    }

    // static void sayHello(Employee employee){
    //     if(employee instanceof VicePrecident){
    //         VicePrecident vp = (VicePrecident) employee;
    //         System.out.println("vp : " + VicePrecident.);
    //     }
    // }
}
