import java.util.Scanner;

//Elabore um programa que leia uma sequência de números inteiros do usuário e exiba o menor
//valor digitado que seja positivo e ímpar. O programa deve parar de ler quando o usuário digitar o
//número 0 utilizando o while.

public class questao23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int menor = Integer.MAX_VALUE;

        while (n!= 0) {
            if (n > 0 && n % 2 != 0 && n< menor) {
                menor = n;
            }
            n= s.nextInt();
        }
        
        if (menor != Integer.MAX_VALUE) {
            System.out.println("O menor valor positivo ímpar digitado foi: " + menor + ".");
        } else {
            System.out.println("Não teve nenhum valor positivo ímpar.");
        }
        s.close();
    }
}
