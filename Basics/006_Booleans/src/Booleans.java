public class Booleans {
    public static void main(String[] args) throws Exception {
        boolean isJavaFun = true;
        System.out.println(isJavaFun); // True
        System.out.println(!isJavaFun); // False

        int a = 10, b = 20;
        System.out.println(a > b); // False
        System.out.println(a < b); // True
        System.out.println(a == b); // False

        System.out.println(10 > 20); // False

        int myAge = 20;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        if(myAge >= votingAge){
            System.out.println("Cukup umur untuk memilih!");
        }else{
            System.out.println("Belum cukup umur untuk memilih!");
        }
    }
}
