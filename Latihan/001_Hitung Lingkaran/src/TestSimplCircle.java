// Ini adalah file main program, kode kita berjalan di file ini
public class TestSimplCircle {
    // Main Program
    public static void main(String[] args) throws Exception {
        // Create circle with a radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The areo of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The areo of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The areo of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        
        // Modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)
        System.out.println("The areo of the circle of radius " + circle2.radius + " is " + circle2.getArea());

    }
}
