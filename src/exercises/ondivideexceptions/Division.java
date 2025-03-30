package exercises.ondivideexceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (reader) {
            System.out.print("Introduce el dividendo: ");
            String input = reader.readLine();

            int dividendo = Integer.parseInt(input);

            System.out.print("Introduce el divisor: ");
            input = reader.readLine();

            int divisor = Integer.parseInt(input);

            int cociente = dividendo / divisor;

            System.out.println(cociente);

        } catch (NumberFormatException _) {
            System.out.println("ERRORFORMAT");
        } catch (ArithmeticException _) {
            System.out.println("ERRORDIV");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
