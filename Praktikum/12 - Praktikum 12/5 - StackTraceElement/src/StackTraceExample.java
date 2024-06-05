public class StackTraceExample {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            
            // Menampilkan informasi stack trace menggunakan StackTraceElement
            for (StackTraceExample element : e.getStackTrace()) {
                System.out.println("Class Name: " + element.getClassName());
                System.out.println("File Name: " + element.getFileName());
                System.out.println("Method Name: " + element.getMethodName());
                System.out.println("Line Number: " + element.getLineNumber());
                System.out.println("-------------------------------");
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("An error occurred");
    }
}
