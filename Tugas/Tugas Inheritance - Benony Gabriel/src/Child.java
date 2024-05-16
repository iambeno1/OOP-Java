public class Child extends Parent {
    private String nim;

    // Konstruktor Child
    public Child(String name, String nim) {
        // Menggunakan keyword 'super' untuk memanggil konstruktor parent class
        super(name);
        this.nim = nim;
    }

    // Overriding method displayInfo dari Parent class
    @Override
    public void displayInfo() {
        // Menggunakan keyword 'super' untuk memanggil method displayInfo dari Parent class
        super.displayInfo();
        System.out.println("Child - nim : " + nim);
    }
}
