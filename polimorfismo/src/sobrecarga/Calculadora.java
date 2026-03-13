package sobrecarga;

public class Calculadora {

    /**
     * Soma dois números inteiros.
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @return A soma de a e b.
     */
    public final int somar(final int a, final int b) {
        return a + b;
    }

    /**
     * Soma três números inteiros.
     * @param a Primeiro número inteiro.
     * @param b Segundo número inteiro.
     * @param c Terceiro número inteiro.
     * @return A soma de a, b e c.
     */
    public final int somar(final int a, final int b, final int c) {
        return a + b + c;
    }

    /**
     * Soma dois números decimais (double).
     * @param a Primeiro número decimal.
     * @param b Segundo número decimal.
     * @return A soma de a e b.
     */
    public final double somar(final double a, final double b) {
        return a + b;
    }
}
