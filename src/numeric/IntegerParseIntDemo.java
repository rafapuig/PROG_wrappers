package numeric;

public class IntegerParseIntDemo {

    public static void main(String[] args) {

        String date = "18-02-1977"; // Fecha en formato dd-mm-yyyy

        int year = Integer.parseInt(date, 6, 10, 10);
        int month = Integer.parseInt(date, 3, 5, 10);
        int day = Integer.parseInt(date, 0, 2, 10);

        System.out.println("Año: " + year);
        System.out.println("Mes: " + month);
        System.out.println("Dia: " + day);
    }

}
