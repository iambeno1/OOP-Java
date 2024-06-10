package superkeyword;

public class Rectangle extends Shape {

    public int getCorner(){
        return 4;
    }

    public int getParentCorner(){
        return super.getCorner();
    }

    
}
