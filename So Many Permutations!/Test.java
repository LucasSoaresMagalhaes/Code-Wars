public class Test {

    public static void main(String[] args) {

        System.out.println(digital_root(493193));

    }

    public static int digital_root(int n) {

        int numeroCasas = String.valueOf(n).toCharArray().length, resultado = 0;
        double divisor = numeroCasas <= 2 ? 10 : Math.pow(10, numeroCasas);

        while (n != 0) {
            resultado += n / divisor;
            n %= divisor;
            divisor /= 10;
        }

        if (numeroCasas > 1) {
            resultado = digital_root(resultado);
        }

        return resultado;

    }
}
