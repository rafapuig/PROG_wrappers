package intro;

class Entero {

    private final int valor;

    public Entero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static Entero valueOf(int valor) {
        return new Entero(valor);
    }

    public static Entero parseInt(String valor) {
        return new Entero(Integer.parseInt(valor));
    }

    public static int sumar(int a, int b) {
        return  a + b;
    }


}

class EnvoltorioDemo {

    public static void main(String[] args) {

        Entero e1 = new Entero(5); // deprecarlo
        Entero e2 = Entero.valueOf(5);
        Entero e3 = Entero.parseInt("45");

        //Integer i1 = new Integer(5); // deprecado
        Integer i2 = Integer.valueOf(5);

        Integer i3 = Integer.parseInt("5");

        Double d = Double.parseDouble("3.1415");
        Float.parseFloat("1.7");
        Float.valueOf(1.7f);



    }

}

