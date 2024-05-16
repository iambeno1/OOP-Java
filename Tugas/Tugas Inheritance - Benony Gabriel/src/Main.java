public class Main {
    public static void main(String[] args) {
        // Membuat objek Parent
        Parent parent = new Parent("Joko");
        // Membuat objek Child
        Child child = new Child("Rido", 20);

        System.out.println("Parent Info:");
        parent.displayInfo();  // Menampilkan informasi Parent

        System.out.println("\nChild Info:");
        child.displayInfo();  // Menampilkan informasi Child, termasuk informasi Parent melalui super.displayInfo()

        // Mengubah nilai atribut name di instance child
        child.name = "Charlie";

        System.out.println("\nUpdated Child Info:");
        child.displayInfo();  // Menampilkan informasi Child setelah perubahan nama

        System.out.println("\nParent Info setelah memodifikasi Child:");
        parent.displayInfo();  // Menampilkan informasi Parent untuk memastikan bahwa perubahan di Child tidak mempengaruhi Parent
    }
}
