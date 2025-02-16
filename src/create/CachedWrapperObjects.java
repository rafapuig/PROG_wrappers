package create;

/**
 * Diferencia entre el uso de constructores y el método valueOf
 * en la creación del objetos Integer
 */
public class CachedWrapperObjects {

    public static void main(String[] args) {
        System.out.println("Usando el constructor (deprecado):");

        // Crear dos objetos Integer mediante el uso del constructor
        Integer iv1 = new Integer(32);
        Integer iv2 = new Integer(32);

        System.out.println("iv1 = " + iv1 + ", iv2 = " + iv2);

        // Comparación de las referencias
        System.out.println("iv1 == iv2 : " + (iv1 == iv2)); // false, son iguales pero no el mismo objeto

        // Comprobar si tienen el mismo valor
        System.out.println("iv1.equals(iv2) : " + (iv1.equals(iv2))); // true ¿Por qué?
        // El método equals está reemplazado para comparar el valor primitivo contenido por los objetos envoltorio

        System.out.println("Usando el método valueOf():");

        // Crear dos objetos Integer usando valueOf()
        Integer iv3 = Integer.valueOf(32); // Boxing del valor primitivo int a objeto Integer
        Integer iv4 = Integer.valueOf(32); // Boxing
        System.out.println("iv3 = " + iv3 + ", iv4 = " + iv4);

        // Comparación de las referencias
        System.out.println("iv3 == iv4 : " + (iv3 == iv4)); // true ¿Por qué?
        // Porque referencian al MISMO objeto Integer
        // ¿Y eso a que es debido?
        // El método valueOf cachea los objetos Integer que crea cuando su valor está entre -128 y 127
        // La segunda llamada a valueOf pasando como argumento 32 de nuevo
        // No instancia un nuevo objeto Integer, sino que devuelve una referencia al Integer con valor 32
        // creado anteriormente
        // Como los Wrappers son inmutables, se puede hacer ese uso compartido de la misma instancia

        // Comprobar si tienen el mismo valor
        System.out.println("iv3.equals(iv4) : " + (iv3.equals(iv4))); // true
    }

}
