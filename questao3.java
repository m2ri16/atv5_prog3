//Elabore um programa que leia um número inteiro e exiba todos os seus divisores.
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 ) {
                System.out.println(i + " é um dos divisores de " + n);
            }
        }
        s.close();
    }
}
