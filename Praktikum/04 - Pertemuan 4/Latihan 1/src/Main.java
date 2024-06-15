public class Main {
    public static void main(String[] args) {
        // Membuat dua objek Stack
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        // Memasukkan angka 0-9 ke dalam stack1
        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }

        // Memasukkan angka 10-19 ke dalam stack2
        for (int i = 10; i < 20; i++) {
            stack2.push(i);
        }

        // Menampilkan isi dari masing-masing stack
        System.out.print("Isi stack 1 : ");
        stack1.display();
        System.out.print("Isi stack 2 : ");
        stack2.display();
    }
}

