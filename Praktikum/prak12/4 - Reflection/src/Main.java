public class Main {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        
        try {
            Validator.validateRequest(request);
        } catch (IllegalAccessException | ValidationException e) {
            e.printStackTrace();
        }
    }
}
