package MenudeOpcoes;

import MenudeOpcoes.Menu;
import java.util.Scanner;

public class Media implements Menu {
    private double nota1;
    private double nota2;
    private double peso1;
    private double peso2;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }


    @Override
    public double opcao1() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Média Aritmética");
        System.out.print("1° Nota: ");
        nota1 = ler.nextDouble();

        System.out.print("1° Nota: ");
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua media é: "+media);

        return media;
    }

    @Override
    public double opcao2() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Média Ponderada");
        System.out.print("1° Nota: ");
        nota1 = ler.nextDouble();

        System.out.print("1° Nota: ");
        nota2 = ler.nextDouble();

        media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        System.out.println("Sua media é: "+media);

        return media;
    }

    @Override
    public void sair() {
        System.out.println("Programa finalizado...");
    }
}
