public class _26_Arrays {
    public static void main(String[] args) throws Exception {
        // String[] buah; // Deklarasi array
        // inisialisasi
        // buah = {"Mangga", "Jeruk"}; eror kalo gini

        // Array cara 1
        String[] myFruits = new String[5];
        myFruits[0] = "Rambutan";
        myFruits[1] = "Apel";
        myFruits[2] = "Mangga";
        myFruits[3] = "Durian";
        myFruits[4] = "Kelapa";

        for (String string : myFruits) {
            System.out.println(string);
        }
        
        System.out.println("\n");

        // Modify array
        myFruits[3] = "Nanas";
        for (String string : myFruits) {
            System.out.println(string);
        }

        System.out.println("\n");

        // Array cara 2
        int[] myNumbers = new int[] {1, 2, 3, 4, 5};
        for (int i : myNumbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Lihat panjang array
        System.out.println(myNumbers.length);
        

        System.out.println("\n");


        // Array cara 3
        String[] buah = {"Mangga", "Jeruk", "Apel", "Nanas"};

        // Akses elemen array
        System.out.println(buah[0]);
        System.out.println(buah[1]);
        System.out.println(buah[2]);
        System.out.println(buah[3]);
        // System.out.println(buah[4]);

        // Akses semua elemen dengan looping
        for(String it :  buah){
            System.out.print(it + " ");
        }

        System.out.println();
        
        // Ganti elemn array
        buah[0] = "Rambutan";
        for(String it :  buah){
            System.out.print(it + " ");
        }
        System.out.println();
        
        for(String it :  buah){
            if(it == "Apel"){
                System.out.println("Ketemu buah " + it);
                break;
            }
        }
        System.out.println();

        int[] myNum = {1, 2, 3, 4, 5, 6, 7};
        // Akses elemen array
        System.out.println(myNum[4]);


    }
}
