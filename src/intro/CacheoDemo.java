package intro;

class A {
    int x;
    int y;

    int suma; // Campo que cachea el resultado de la operacion
    boolean yaHeSumado = false;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sumar() {
        if(!yaHeSumado) {
            suma = x + y;
            yaHeSumado = true;
        }
        return suma;
    }

}

public class CacheoDemo {
    public static void main(String[] args) {

        A a = new A(3, 4);

        for (int i = 0; i < 10; i++) {
            System.out.println(a.sumar()); // Se repite 10 veces
        }

        Number n1 = null;
        Integer ii = Integer.valueOf(1);
        Integer i2 = 2; // Autoboxing
        int x = i2;

        Float ff = Float.valueOf(2.0f);
        n1 = ii;
        n1 = ff;

        float f = n1.floatValue();

        Integer.sum(3,4);

         Integer iii = Integer.valueOf("patata");


             int ix = Integer.parseInt("patara");



         double ddd=  Double.parseDouble("1.13");
         Double dObj = Double.valueOf("1.13");




    }
}
