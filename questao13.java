import java.util.Scanner;
//Faça um programa que leia um número inteiro e exiba a soma dos seus dígitos elevados ao cubo
//utilizando o while.
public class questao13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();
        int soma = 0;
        int i = 0;
        int res = 0;
    
        while(n > 0){
            int digito = n % 10;
            soma += digito;
            res = (int) Math.pow(soma, 2);
            n/=10;
        } 
        System.out.println("A soma dos seus dígitos elevados ao cubo é igual a " + res + ".");
        s.close();
    }
}
