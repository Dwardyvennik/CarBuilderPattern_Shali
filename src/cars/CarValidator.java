package cars;

public class CarValidator {
    public CarValidator(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
    }
}
