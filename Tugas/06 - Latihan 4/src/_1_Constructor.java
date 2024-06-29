public class _1_Constructor {
    String name;
    String address;
    final String country = "Indonesia";
    
    // Konstruktor dengan parameter
    public _1_Constructor(String parName, String parAddress) {
        // name = parName;
        // address = parAddress;

        // This Keyword
        this.name = parName;
        this.address = parAddress;
    }

    // Overloading constructor
    _1_Constructor(String parName){
        // name = parName;
        // Manggil constructor lain
        this("Beno", null);
    }
    
    _1_Constructor(){
        // Manggil constructor lain
        this(null);
    }

    void sayHello(String parName) {
        System.out.println("Hello " + parName + ", my name is " + name);
        System.out.println("Hello " + parName + ", my name is " + this.name);
        this.sayHello("Bossku");
    }

    public static void main(String[] args) throws Exception {
        // Membuat objek person menggunakan konstruktor
        _1_Constructor person = new _1_Constructor("Beno", "Kisar");
        person.sayHello("Budi");
        var person1 = new _1_Constructor("Beno", "Kisar");
        var person2 = new _1_Constructor("Beno");
        var person3 = new _1_Constructor();
    }
}
