// Ini adalah class dengan nama Car. Nama file.java harus sama dengan nama class nya
public class MyClass {
    // Ini adalah data/field dalam class Car
    static String[] cars = {"Volvo", "Audi", "Toyota", "Ferari"};

    int num1 = 10;
    int num2 = 20;
    int count;

    // Ini juga field berupa method
    static void myCars(){
        System.out.print("My Cars : ");
        for (String it : cars) {
            System.out.print(it + " ");
        }
    }

    static int sum(){
        // Bikin objek
        MyClass val1 = new MyClass();
        MyClass val2 = new MyClass();

        int a = val1.num1;
        int b = val2.num2;

        return a + b;
    }

}
