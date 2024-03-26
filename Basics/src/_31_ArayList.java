import java.util.ArrayList;
public class _31_ArayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Brio");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Oto");
        System.out.println(cars);

        ArrayList<Integer> myNum = new ArrayList<>();
        myNum.size();
        System.err.println(myNum);
        myNum.add(10);
        myNum.add(20);
        myNum.add(30);
        myNum.add(40);
        System.out.println(myNum);

        ArrayList<Integer> testInputFor = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            testInputFor.add(i * 10);
        }
    System.err.println(testInputFor.size());
    System.out.println(testInputFor);
    }
}
