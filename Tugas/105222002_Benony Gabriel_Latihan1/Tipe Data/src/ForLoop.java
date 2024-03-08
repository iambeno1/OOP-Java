public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;
        for(; counter <= 10;){
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        for(var awal = 1; counter <= 10; counter++){
            System.out.println("Perulangan ke-" + awal);
        }
    }
}
