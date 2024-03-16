public class _25_Continue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println("Loop ke-" + i); // 5 di skip
            i++;
        }
    }
}
