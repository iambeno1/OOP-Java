public class Parent {
    String name; // Atribut untuk menyimpan nama
 
    public Parent(String name) {
        this.name = name; // Menetapkan nilai parameter 'name' ke atribut 'name'
    }

    public void display() {
        System.out.println("Parent Name: " + name); // Mencetak nama parent
    }
}
