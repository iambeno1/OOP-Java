import java.lang.reflect.Field;

public class Validator {
    public static void validateRequest(CreateUserRequest request) throws IllegalAccessException, ValidationException {
        Field[] fields = request.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(NotBlank.class) != null) {
                field.setAccessible(true);
                String value = (String) field.get(request);
                if (value == null || value.isBlank()) {
                    throw new ValidationException("Field " + field.getName() + " is blank");
                }
            }
        }
    }
}
