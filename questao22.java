import java.util.Scanner;
//Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
//dos números que estão entre 50 e 100. O programa deve parar de ler quando o usuário digitar o
//número 0 utilizando o while.
public class questao22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int soma = 0;
        int quant = 0; 

        while (n != 0) {
            if (n >= 50 && n <= 100) {
                soma += n;
                quant++;
            }
            n = s.nextInt();
        }
        
        if (quant > 0) {
            double media = (double) soma / quant;
            System.out.println("Média dos números entre 50 e 100 é de " + media + ".");
        } else {
            System.out.println("Não existe número entre 50 e 100.");
        }
        s.close();
        }
    }

