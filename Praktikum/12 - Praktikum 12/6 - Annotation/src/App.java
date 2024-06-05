@Fancy(name = "Eko", tags = {"app", "java"})
public class App{
    public static void main(String[] args) {
        Class<App> obj = App.class;

        // Mengecek apakah annotation Fancy ada di kelas Application
        if (obj.isAnnotationPresent(Fancy.class)) {
            Fancy fancy = obj.getAnnotation(Fancy.class);

            // Menampilkan nilai dari elemen annotation
            System.out.println("Name: " + fancy.name());
            System.out.print("Tags: ");
            for (String tag : fancy.tags()) {
                System.out.print(tag + " ");
            }
        }
    }
}