public class _27_ArrayMultidimensi {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // Akses value
        System.out.println(myNumbers[1][2]); // Outputs 7
        System.out.println(myNumbers[0][2]); // Outputs 3
        System.out.println(myNumbers[0][0]); // Outputs 1
        System.out.println(myNumbers[1][0]); // Outputs 5

        // Ganti value
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                    System.out.print(myNumbers[i][j] + " ");
                }
            }
    }
}
