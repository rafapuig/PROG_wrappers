package numeric;

public class NumericWrapperDemo {

    public static void main(String[] args) {
        // Create un objeto Integer
        Integer intObj = Integer.valueOf(100);

        // Obtener e valor con tipo byte a partir del objeto Integer
        byte ib = intObj.byteValue();

        // Obtener e valor con tipo double a partir del objeto Integer
        double id = intObj.doubleValue();

        System.out.println("intObj = " + intObj);
        System.out.println("byte a partir de intObj = " + ib);
        System.out.println("double a partir de doubleObj = " + id);


        // Crear un objeto Double
        Double doubleObj = Double.valueOf("3.1415926");

        // Obtener diferentes tipos de valores primitivos a partir del objeto Double
        double d = doubleObj.doubleValue(); // Unboxing
        float f = doubleObj.floatValue();
        long l = doubleObj.longValue();
        int i = doubleObj.intValue();
        short s = doubleObj.shortValue();
        byte b = doubleObj.byteValue();

        System.out.println("doubleObj = " + doubleObj);
        System.out.println("double a partir de doubleObj = " + d);
        System.out.println("float a partir de doubleObj = " + f);
        System.out.println("long a partir de longObj = " + l);
        System.out.println("int a partir de intObj = " + i);
        System.out.println("short a partir de shortObj = " + s);
        System.out.println("byte a partir de byteObj = " + b);
    }
}
