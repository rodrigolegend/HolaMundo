public class CalculadoraTest {

    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   EJECUTANDO TESTS - Calculadora.java  ");
        System.out.println("========================================");
        System.out.println();

        check("sumar(2, 3) = 5",       Calculadora.sumar(2, 3),       5);
        check("sumar(10, 0) = 10",     Calculadora.sumar(10, 0),      10);
        check("restar(10, 4) = 6",     Calculadora.restar(10, 4),     6);
        check("restar(5, 5) = 0",      Calculadora.restar(5, 5),      0);
        checkBool("esPar(4) = true",   Calculadora.esPar(4),          true);
        checkBool("esPar(7) = false",  Calculadora.esPar(7),          false);
        check("multiplicar(3, 4) = 12", Calculadora.multiplicar(3, 4), 12);
        check("multiplicar(5, 5) = 25", Calculadora.multiplicar(5, 5), 25);

        System.out.println();
        System.out.println("========================================");
        System.out.printf("  Resultado: %d pasaron, %d fallaron%n", passed, failed);
        System.out.println("========================================");

        if (failed > 0) {
            System.out.println("  BUILD FAILED ");
            System.exit(1);
        } else {
            System.out.println("  BUILD PASSED ");
        }
    }

    static void check(String nombre, int obtenido, int esperado) {
        if (obtenido == esperado) {
            System.out.printf("   PASS: %s%n", nombre);
            passed++;
        } else {
            System.out.printf("   FAIL: %s → obtuvo %d, esperado %d%n", nombre, obtenido, esperado);
            failed++;
        }
    }

    static void checkBool(String nombre, boolean obtenido, boolean esperado) {
        if (obtenido == esperado) {
            System.out.printf("   PASS: %s%n", nombre);
            passed++;
        } else {
            System.out.printf("   FAIL: %s → obtuvo %b, esperado %b%n", nombre, obtenido, esperado);
            failed++;
        }
    }
}
