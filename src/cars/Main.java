package cars;
public class Main {
    public static void main(String[] args) {
        Car car = Car.builder("Honda", "idk")
                .withEngine("V6")
                .withColor("Black")
                .withSeats(4)
                .build();

        System.out.println(car);

        Car defaultCar = Car.builder("Mercedes", "Benz").build();
        System.out.println(defaultCar);

        Car validatedCar = Car.createCar("BMW");
        System.out.println(validatedCar);

        try {
            Car invalidCar = Car.createCar("   ");
            System.out.println(invalidCar);
        } catch (Exception e) {
            System.out.println("Ошибка при создании машины: " + e.getMessage());
        }
    }
}
