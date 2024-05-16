public class Child extends Parent {
    int age; 

    
    public Child(String name, int age) {
        super(name); // Memanggil constructor parent dan menetapkan nilai 'name'
        this.age = age; // Menetapkan nilai parameter 'age' ke atribut 'age'
    }

    @Override
    public void display() {
        super.display(); // Memanggil method 'display' dari parent class untuk menampilkan nama
        System.out.println("Child Age: " + age); // Mencetak usia child
    }
}
