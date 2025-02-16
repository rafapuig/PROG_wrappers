package bool;

public class BooleanWrapperDemo {

    public static void main(String[] args) {
        // Uso de constructores (deprecado)
        Boolean b11True = new Boolean(true);
        Boolean b21True = new Boolean("true");
        Boolean b31True = new Boolean("tRuE");
        Boolean b41False = new Boolean("false");
        Boolean b51False = new Boolean("otra cosa");

        //Uso del método factoría
        Boolean b12True = Boolean.valueOf(true); // Es un boxing
        Boolean b22True = Boolean.valueOf("true");
        Boolean b32True = Boolean.valueOf("tRuE");
        Boolean b42False = Boolean.valueOf("false");
        Boolean b52False = Boolean.valueOf("otra cosa");

        // Obtener un valor boolean a partir de un objeto Boolean
        boolean bbTrue = b12True.booleanValue(); // Es un unboxing

        // Parsing de string a valor boolean
        boolean bTrue = Boolean.parseBoolean("true");
        boolean bFalse = Boolean.parseBoolean("otra cosa que no sea true se evalua a false");
        boolean b2True = Boolean.valueOf("tRuE").booleanValue();

        // Uso de las constantes
        Boolean bcTrue = Boolean.TRUE;
        Boolean bcFalse = Boolean.FALSE;

        // Imprimir objetos Boolean
        System.out.println("bcTrue: " + bcTrue);
        System.out.println("bcFalse: " + bcFalse);

        System.out.println("b11True == b21True " + (b11True == b21True));
        System.out.println("b11True.equals(b21True) " + (b11True.equals(b21True)));
    }
}
