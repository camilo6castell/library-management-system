package src.validations;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IsLoanOnTime {
    public void execute(LocalDate dateRequired, LocalDate dateFinalized) {
        long days = ChronoUnit.DAYS.between(dateRequired, dateRequired);
        if (Math.abs(days) <= 15){
            System.out.println("Prestamo ha sido marcado como 'finalizado.\n");
            System.out.println("Nota. El usuario cumplió con la fecha establecida de entrega.\n");
        } else {
            System.out.println("Prestamo ha sido marcado como 'finalizado.\n");
            System.out.println("Nota. El usuario no cumplió con la fecha establecida de entrega.\n");
        }
    }
}
