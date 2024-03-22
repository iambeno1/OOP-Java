public class Main {
    public static void main(String[] args) throws Exception {

        // Bikin objek
        MyClass number1 = new MyClass();
        MyClass number2 = new MyClass();

        // Akses field dari class MyClass
        int val1 = number1.num1;
        int val2 = number2.num2;

        System.out.println(val1);
        System.out.println(val2);

        // Modify field dari class MyClass
        number1.num1 = 100;
        number2.num2 = 300;

        int numModif1 = number1.num1;
        int numModif2 = number2.num2;

        System.out.println(numModif1);
        System.out.println(numModif2);
        

        // Karena data/field yg dibuat di class MyClass adalah berupa static, kita dapat memanggilnya langsung tanpa perlu membuat objek
        MyClass.myCars();

        System.out.println("\nSum = " + MyClass.sum());

        // Bikin objek baru
        MyClass myCar = new MyClass();

        myCar.count = 15;
        int jumlah = myCar.count;

        System.out.println("My Car : " + MyClass.cars[3]);
        System.out.println("Jumlah : " + jumlah);
    }
}
