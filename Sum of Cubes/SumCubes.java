import java.util.Scanner;

public class SumCubes {
    public static void main(String[] args) {
        Scanner ler1 = new Scanner(System.in);
        long targetNumber = ler1.nextLong();
        double total = 0;
        double i = 1;
        while (i <= targetNumber) {
            total += i * i * i;
            i++;
        }

        System.out.println(total);
        ler1.close();
    }

    public static long test(long n) {
        long aux;
        if (n % 2 == 0)
            aux = (n / 2) * (n + 1);
        else
            aux = ((n + 1) / 2) * n;
        return aux * aux;
    }
}