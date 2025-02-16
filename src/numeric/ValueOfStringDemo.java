package numeric;

public class ValueOfStringDemo {

    public static void main(String[] args) {
        String string = "10101010";
        int radix = 2; // Binario

        // Crear un objeto Integer a partir de un string
        Integer intObject = Integer.valueOf(string, radix);

        // Extraer el valor primitivo int a partir de un string
        int intValue = Integer.parseInt(string, radix);

        System.out.println("Numero en formato binario: " + string);
        System.out.println("intObject = " + intObject);
        System.out.println("intValue = " + intValue);
    }

}
