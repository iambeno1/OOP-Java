public class _16_Strings {
    public static void main(String[] args) throws Exception {
        String myString = "Hello"; // String dimulai dengan huruf 'S' besar
        System.out.println("myString: " + myString);

        // String length()
        String alphabet = "abcdefghijklmnopkrstuvwxyz";
        System.out.println("Alphabet = " + alphabet);
        System.out.println("Alphabet.length() = " + alphabet.length());

        // String Methods
        String myName = "Benony Gabriel";
        System.out.println("myName = " + myName);
        System.out.println("myName.toLowerCase = " + myName.toLowerCase());
        System.out.println("myName.toUpperCase = " + myName.toUpperCase());
        
        // Finding a Character in a String
        System.out.println("myName = " + myName);
        System.out.println("myName.indexOf(\"Gabriel\") = " + myName.indexOf("Gabriel"));
        System.out.println("myName.indexOf(\"ony\") = " + myName.indexOf("ony"));
        System.out.println("myName.indexOf(\"Beny\") = " + myName.indexOf("Beny"));
    }
}
