package FormulaBhaskara;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double delta;
        System.out.println("Formula de Bhaskara - Forneça abaixo os valores");
        System.out.print("A: ");
        double a = ler.nextDouble();

        System.out.print("B: ");
        double b = ler.nextDouble();

        System.out.print("C: ");
        double c = ler.nextDouble();

        delta = (Math.exp(2)) - (4 * a * c);
        if ((a == 0) || (delta < 0)) {
            System.out.println("Não é possivel fazer o calculo");
        } else {
            double x1 = (-1 * b + (Math.sqrt(delta)) / (2*a));
            double x2 = (-1 * b + (Math.sqrt(delta)) / (2*a));

            System.out.printf("O primeiro x vale: = %.2f\n", x1);
            System.out.printf("O segundo x vale: = %.2f\n", x2);
        }

    }
}
