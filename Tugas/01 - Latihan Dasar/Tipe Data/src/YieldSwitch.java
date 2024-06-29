public class YieldSwitch {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan = switch (nilai) {
            case "A" -> "Anda lulus!";
            case "B", "C" -> "Lumayan bagus!";
            case "D" -> "Tidak Lulus";
            default -> "Auto salah jurusan";
        };
        System.out.println(ucapan); // Menampilkan hasil ucapan
    }
}
