package MenudeOpcoes;
import  java.util.Scanner;

public class TesteMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Media aluno = new Media();

       // aluno.opcao1();
        System.out.println("Menu de Opções - Faça a sua escolha");
        System.out.println("1. Média aritmética \n" +
                "2. Média ponderada \n" +
                "3. Sair ");

        int a = 1, p = 2, s = 3;
        int escolha = ler.nextInt();

        if (escolha == a){
            aluno.opcao1();
        } else{
            aluno.opcao2();
        }



            }
        }

