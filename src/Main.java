import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("λ: ");
        double lambda = scanner.nextDouble();

        double p = 0.001;

        int n = (int) Math.round(lambda / p);

        int x = binom(n, p);

        System.out.println("X: " + x);
    }

    public static int binom(int n, double p) {
        int succes = 0;
        for (int i = 0; i < n; i++) {
            if (Math.random() < p) {
                succes++;
            }
        }
        return succes;
    }
}