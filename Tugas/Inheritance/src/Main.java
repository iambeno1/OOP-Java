public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Parent
        Parent parent = new Parent("wiwi");
        parent.display(); // Memanggil method display pada objek parent


        Child child = new Child("wiwi", 21);
        child.display(); // Memanggil method display pada objek child
    }
}
