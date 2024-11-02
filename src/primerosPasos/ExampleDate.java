import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExampleDate {
    public static void main(String[] args){
        // Date
        LocalDate ld = LocalDate.of(2021, 9, 15);
        // Time

        System.out.println(ld);
        ld = ld.plusDays(1);
        System.out.println(ld);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = ld.format(formatter);
        System.out.println(fecha);

    }
}
