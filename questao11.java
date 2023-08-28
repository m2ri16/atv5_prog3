import java.util.Scanner;
//Crie um programa que leia uma sequência de números inteiros do usuário e exiba o maior e o
//menor valor digitado. O programa deve parar de ler quando o usuário digitar o número 0
//utilizando o while.

public class questao11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int maior = n;
        int menor = n;

        while (n != 0) {
            if (n > maior) {
                maior = n;
            } else if (n < menor) {
                menor = n;
            }
            n = s.nextInt();
        }

        System.out.println("Menor valor digitado: " + menor);
        System.out.println("Maior valor digitado: " + maior);
        s.close();
    }
}
