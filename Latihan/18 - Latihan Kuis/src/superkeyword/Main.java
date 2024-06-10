package superkeyword;

public class Main {
    public static void main(String[] args) throws Exception {


        // Jalankan super keyword
        Shape parentShape = new Shape();
        System.out.println("Parent corner : " + parentShape.getCorner());


        Rectangle childCorner = new Rectangle();
        System.out.println("Child corner : " + childCorner.getCorner());
        System.out.println("ChildParent corner : " + childCorner.getParentCorner());

    }
}
