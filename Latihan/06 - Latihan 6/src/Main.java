public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        Tutor t = new Tutor(s1, s2);

        t.s1.printDetails();

        Tutor tAvg = new Tutor(s1, s2);
        tAvg.compareStudent();
    }
}



/*
Kesimpulan hari ini:
- Objek itu bisa di passing
- Bisa di return
- Bisa lahh banyak
 */