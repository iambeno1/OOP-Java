public class _6_TukarNilai {
    public static void main(String[] args) {
        int tiga = 3;
        int lima = 5;

        System.out.println("Nilai awal");
        System.out.println("Tiga = " + tiga);
        System.out.println("Lima = " + lima);
        
        System.out.println("\nSetelah ditukar");
        int temp;
        temp = tiga;
        tiga = lima;
        lima = temp;
        System.out.println("Tiga = " + tiga);
        System.out.println("Lima = " + lima);
    }
}
