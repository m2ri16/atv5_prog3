import java.util.Scanner;

//Crie um programa que leia uma sequência de números inteiros do usuário e exiba a média dos
//números digitados. O programa deve parar de ler quando o usuário digitar o número -1 utilizando
//o while.

public class questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequencia de número inteiro, para sair do sistema digite -1. ");
        int n = s.nextInt();
        int soma = 0;
        int quant = 0;

        while (n != -1) {
            soma += n;
            quant++;
            n= s.nextInt();
        }

        if (quant > 0) {
            double media = (double) soma / quant;
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        
        s.close();
    }
}
