public class Array {
    public static void main(String[] args) throws Exception {
        // String[] buah; // Deklarasi array
        // inisialisasi
        // buah = {"Mangga", "Jeruk"}; eror kalo gini

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
