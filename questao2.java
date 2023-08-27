//Faça um programa que exiba a soma dos dígitos de um número inteiro fornecido pelo usuário.

import java.util.Scanner;

public class questao2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = s.nextInt();
        int soma = 0;

        while (n > 0) {
          int digito = n % 10;
          soma += digito;
          n /= 10;  // igual a n / 10 sem a criação de uma nova variavel;
       }

       System.out.println("A soma dos dígitos do número inteiro é " + n );
       s.close();
    }
}