public class _18_IfElse {
    public static void main(String[] args) throws Exception {
        System.out.println("Java If Else");

        int myAge = 18;
        if(myAge >= 18){
            System.out.println("Cukup umur utk memilih");
        }else{
            System.out.println("Belum cukup umur utk memilih");
        }

        // Short hand
        int myNumber = 3;
        String cekEven = (myNumber % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(cekEven);
    }
}
