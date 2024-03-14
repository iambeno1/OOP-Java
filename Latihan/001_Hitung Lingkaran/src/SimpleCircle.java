// File ini digunakan untuk menyimpan method-method yang diperlukan untuk menghitung lingkaran
public class SimpleCircle {
    double radius; // deklarasi variabel radius yang bersifat global untuk class SimpleCircle
    final double PHI = 3.14;

    // Konstruktor dengan radius 1
    SimpleCircle(){
        radius = 1;
    }

    // Konstruktor
    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    // Method return
    double getArea(){
        return radius * radius * PHI;
    }

    // Method return
    double getPerimeter(){
        return 2 * radius * PHI;
    }

    // Method void
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
