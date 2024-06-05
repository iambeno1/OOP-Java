public class ForEach {
    public static void main(String[] args) {
        int[] myNum = {
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10
        };


        // Ini for biasa
        for(int i = 0; i < myNum.length; i++){
            System.out.println(myNum[i]);
        }

        // ini for each
        for (int i : myNum) {
            System.out.println(i);
        }
    }
}
