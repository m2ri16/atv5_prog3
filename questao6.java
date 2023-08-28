import java.util.Scanner;
//Elabore um programa que leia um número inteiro e exiba a soma dos dígitos pares desse número.

public class questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();
        int soma = 0;
        int i = 0;
    
        while(n > 0){
            int digito = n % 10;
            if (digito % 2 == 0) {
                soma += digito;
            }
            n/=10;
        } 
        System.out.println("A soma dos digitos pares é " + soma + ".");
        s.close();
    }
    
}
