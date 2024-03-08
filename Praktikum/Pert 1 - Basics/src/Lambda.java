public class Lambda {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A" -> System.out.println("Anda lulus!");
            case "B", "C" -> System.out.println("Lumayan bagus!");
            case "D" -> System.out.println("Tidak Lulus");
            default ->{
                System.out.println("Auto salah jurusan");
            }
        }
    }
}
