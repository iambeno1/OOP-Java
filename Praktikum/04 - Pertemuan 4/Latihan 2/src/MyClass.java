public class MyClass {
    public double width;
    public double height;
    public double depth;

    // Constructor dengan tiga parameter width, height, dan depth
    public MyClass(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor dengan satu parameter length
    public MyClass(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    // Constructor tanpa parameter
    public MyClass() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // Fungsi untuk menghitung volume kotak
    public double volume() {
        return width * height * depth;
    }
}
