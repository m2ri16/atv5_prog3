//Desenvolva um programa que calcule a média de altura de 5 pessoas.
import java.util.Scanner;


public class questao4 {
    public static void main(String[] args) {
        double soma = 0; 
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a altura: ");

         for (int i = 0; i <= 5; i++) {
            double altura = s.nextDouble();
            soma = +altura;
        }

        double media = soma / 5;
        System.out.println("A média da altura de 5 pessoas é " + media + ".");
        s.close();
    }
}
