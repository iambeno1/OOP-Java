public class Array {
    public static void main(String[] args) {
        String[] arrString;
        arrString = new String[3];
        arrString[0] = "Benony";
        arrString[1] = "Gabriel";

        System.out.println(arrString[0]);
        System.out.println(arrString[1]);

        // Cara 2
        int[] numberInt = new int[]{
            10, 20, 30, 40
        };
        
        int[] numberLong = new int[]{
            10, 20, 30, 40
        };

        // Operasi Array
        numberLong[0] = 15;


        // Array multidimensi
        // Aray di dalam array
        String[][] members = {
            {"Beno", "adalah", "Programmer"},
            {"yang", "Handal"}
        };
        String[] member1 = members[0];
        System.out.println(member1[0]);
    }
}
