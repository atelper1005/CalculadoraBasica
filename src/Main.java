import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    final static Integer A = 2;
    final static Integer B = 3;

    final static String OPERACION = "suma";

    final static Float A_DECIMAL = 2.5F;

    final static Float B_DECIMAL = 3.8F;

    enum Operacion {
        suma, resta, multi, div
    }

    public static void main(String[] args) {

        CalculadoraBasica basica = new CalculadoraBasica();
        Operacion operacionSeleccionada = Operacion.suma;
        int a = 2;
        int b = 3;
        int c = 4;

        basica.suma(a,b);

        basica.suma(a,b,c);

        System.out.println(basica.suma(A_DECIMAL, B_DECIMAL));

        switch (operacionSeleccionada) {
            case suma:
                out.println("La suma de " + A + " + " + B + " = " + basica.suma(A, B));
                break;

            case resta:
                out.println("La resta de " + A + " - " + B + " = " + basica.resta(A, B));

            case multi:
                out.println("La multiplicacion de " + A + " x " + B + " = " + basica.multiplicacion(A, B));

            case div:
                out.println("La division de " + A + " / " + B + " = " + basica.division(A, B));
        }
    }
}