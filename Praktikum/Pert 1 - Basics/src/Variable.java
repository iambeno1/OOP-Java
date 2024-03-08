public class Variable {
    public static void main(String[] args) {
        // Tipe String
        String fname = "Benony ";
        String lname = "Gabriel";
        String fullName = fname + lname;

        int age = 19;
        String alamat = "Indonesia";

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(alamat);

        // Tipe var
        var nim = "105222002"; // auto detect ini bertipe string. tipe ini harus diinisialisasi value nya langsung

        System.out.println(nim);

        // Tipe const
        final int tahunLahir = 2004;
        System.out.println(tahunLahir);
    }
}
