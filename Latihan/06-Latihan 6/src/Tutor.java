public class Tutor {
    Student s1, s2;  // ini adalah instance variabel / global variabel dari tipe data class Student

    // Note:
    // Class itu bisa di passing
    // Class juga bisa jadi tipe data
    // Bisa juga dijadikan tipe data parameter
    // Objek bisa memanggil objek

    public Tutor (Student stu1, Student stu2){
        s1 = stu1;
        s2 = stu2;
    }

    public void compareStudent(){
        if(s1.getAverage(5) >= s2.getAverage(8)){
            System.out.println("s1 is better");
        }else{
            System.out.println("s2 is better");
        }
    }

}
