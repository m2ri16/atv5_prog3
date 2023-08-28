import java.util.Scanner;

//Faça um programa que leia um número inteiro e exiba o número invertido. Por exemplo, se o
//número lido for 123, o programa deve exibir 321.

public class questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();
        int invertido = 0;

        while (n > 1) {
            int digito = n % 10; 
            invertido = invertido * 10 + digito;
            n /=10;
        }
        System.out.println("O número invertido será : " + invertido + ".");
        s.close();
    }
}
