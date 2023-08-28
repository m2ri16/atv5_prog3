//Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números possuem mais de três dígitos. O programa deve parar de ler quando o usuário digitar o
//número 0 utilizando o while.
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int digitos = 0;

        while (n != 0) {
            if (Math.abs(n) >= 1000) {  // Verifica se o número tem mais de três dígitos
                digitos++;
            }
            n= s.nextInt();
        }
        System.out.println("Números com mais de três dígitos: " + digitos + ".");
        s.close();
    }
}
