public class Main {
    public static void main(String[] args) throws Exception {
        // Contoh penggunaan
        LoginRequest request = new LoginRequest("", "password123");
        try {
            validateRuntime(request);
        } catch (BlankException e) {
            System.err.println(e.getMessage());
        }

        // Contoh NulPointerException
        String str = null; // String belum diinisialisasi
        System.out.println("Attempting to get length of null string:");
        System.out.println(str.length()); // Ini akan melemparkan NullPointerException
        System.out.println("This line will not be executed because the exception was thrown.");

        // tanpa try catch
        int[] numbers = {1, 2, 3};
        System.out.println("mencoba mengakses elemen di luar batas:");
        System.out.println(numbers[3]); // ini akan melempar arrayIndexoutofboundsException
        System.out.println("Baris ini tidak akan dieksekusi karena pengecualian dilemparkan.");
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.getUsername() == null) {
            throw new BlankException("Username tidak boleh null");
        } else if (loginRequest.getUsername().isEmpty()) {
            throw new BlankException("Username tidak boleh kosong");
        } else if (loginRequest.getPassword() == null) {
            throw new BlankException("Password tidak boleh null");
        } else if (loginRequest.getPassword().isEmpty()) {
            throw new BlankException("Password tidak boleh kosong");
        }
    }
    
}
