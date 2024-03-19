public class Nilai {
    int[] nilai;

    public Nilai(int[] nilai) {
        this.nilai = nilai;
    }

    double hitungRataRata() {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }
}
