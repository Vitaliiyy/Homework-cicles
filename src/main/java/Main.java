import ru.netology.services.ServiceClass;

public class Main {
    public static void main(String[] args) {
        ServiceClass service = new ServiceClass();
        int result = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Отдыхать " + result + " Месяца");

    }
}
