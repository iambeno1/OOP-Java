public class Break {
    public static void main(String[] args) throws Exception {
        // Break untuk berhenti/lompat keluar
        for(int i = 0; i < 10; i++){
            System.out.println("Loop ke-" + i);

            if(i == 5){
                System.out.println("\nBreak di Loop ke-" + i);
                break;
            }
        }
    }
}
