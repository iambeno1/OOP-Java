public class Child extends Parent {
    private int age;

    // Konstruktor Child
    public Child(String name, int age) {
        // Menggunakan keyword 'super' untuk memanggil konstruktor parent class
        super(name);
        this.age = age;
    }

    // Overriding method displayInfo dari Parent class
    @Override
    public void displayInfo() {
        // Menggunakan keyword 'super' untuk memanggil method displayInfo dari Parent class
        super.displayInfo();
        System.out.println("Child Age: " + age);
    }
}
