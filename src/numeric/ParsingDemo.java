package numeric;

import java.util.Scanner;

public class ParsingDemo {

    public static void main(String[] args) {

        double d1 = parseDouble("123.45");
        double d2 = parseDouble("67F.40");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        // El objeto Scanner reserva recursos que hay que liberar llamado al método close
        // Para asegurar que se llama al método close, sin tener que escribir un bloque finally
        // usamos un bloque try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            double d3 = readDouble(scanner, "Introduce el valor del radio de un circulo: ");
            System.out.println("d3 = " + d3);
            scanner.close(); // Innecesario llamar explícitamente a close, se llamará seguro en finally
        }
    }

    static double parseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Error en el parsing del valor numérico: " + value);
        }
        return Double.NaN;
    }

    static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Error, introduce un valor numérico valido");
            }
        }
    }

}
