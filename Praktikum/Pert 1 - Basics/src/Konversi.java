public class Konversi {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;

        System.out.println("iniByte: " + iniByte);
        System.out.println("iniShort: " + iniShort);
        System.out.println("iniInt: " + iniInt);
        System.out.println("iniLong: " + iniLong);
        System.out.println("iniLong: " + iniLong);
        System.out.println("iniFloat: " + iniFloat);
        System.out.println("iniDouble: " + iniDouble);
        System.out.println("iniFloat2: " + iniFloat2);
        System.out.println("iniLong2: " + iniLong2);


        // Konversi ke tipe data primitif
        int age = 30;

        Integer ageObjek = age;

        int ageAgain = ageObjek;

        short shortAge = ageObjek.shortValue();

        byte byteAge = ageObjek.byteValue();

        System.out.println(age);
        System.out.println(ageObjek);
        System.out.println(ageAgain);
        System.out.println(shortAge);
        System.out.println(byteAge);
    }
}
