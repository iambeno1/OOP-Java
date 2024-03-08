public class TipeData {
    public static void main(String[] args) throws Exception {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000;
        long iniLong2 = 1000000L;

        float iniFloat = 5.3f;
        double iniDouble = 37.50d;

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        System.out.println("iniByte: " + iniByte);
        System.out.println("iniShort: " + iniShort);
        System.out.println("iniInt: " + iniInt);
        System.out.println("iniLong: " + iniLong);
        System.out.println("iniLong2: " + iniLong2);
        System.out.println("iniFloat: " + iniFloat);
        System.out.println("iniDouble: " + iniDouble);
        System.out.println("decimalInt: " + decimalInt);
        System.out.println("hexInt: " + hexInt);
        System.out.println("binInt: " + binInt);
        System.out.println("balance: " + balance);
        System.out.println("sum: " + sum);

        // Tipe Character
        char b = 'B';
        char e = 'E';
        char n = 'N';
        char o = 'O';

        System.out.print(b);
        System.out.print(e);
        System.out.print(n);
        System.out.print(o);

        // Tipe Boolean
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);
        System.out.println(!salah);

        // Tipe String
        String fname = "Benony ";
        String lname = "Gabriel";
        String fullName = fname + lname;

        System.out.println(fname);
        System.out.println(lname);
        System.err.println(fullName);

    }
}
