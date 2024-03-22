public class Main {
    public static void main(String[] args) {
        // Membuat objek MyClass dengan constructor pertama
        MyClass MyClass1 = new MyClass(3, 4, 5);
        System.out.println("Volume MyClass1: " + MyClass1.volume());

        // Membuat objek MyClass dengan constructor kedua
        MyClass MyClass2 = new MyClass(6);
        System.out.println("Volume MyClass2: " + MyClass2.volume());

        // Membuat objek MyClass dengan constructor ketiga
        MyClass MyClass3 = new MyClass();
        System.out.println("Volume MyClass3: " + MyClass3.volume());
    }
}
