package src.validations;

import java.util.Scanner;

public class IsValidQuantity {
    public int execute(String message, Scanner scanner) {
        int numero;

        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número entero válido.");
                System.out.print(message);
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero <=  0) {
                System.out.println("Por favor, ingresa un número entero mayor que 0.");
            }
        } while (numero <= 0);

        return numero;
    }
}
