public class MyClass {
    // Ini adalah variabel instance
    private int x;
    private int y;

    // Default Constructor
    public MyClass(){}

    MyClass(int x){
        // Menginisialisasi variabel instance x
        this.x = x; // this digunakan untuk merujuk pada variabel instance x
    }

    public void printX(){
        System.out.println(this.x); // Memanggil variabel instance x
    }

    public MyClass myObj(){
        return this;
    }

    public MyClass(int x, int y){
        this(x); // Memanggil konstruktor lain dalam kelas ini
        this.y = y;
    }

    public MyClass setX(int x){
        this.x = x;
        return this; // Mengembalikan dirinya sendiri untuk method chaining
    }

    public int getX(){
        return this.x;
    }

}
