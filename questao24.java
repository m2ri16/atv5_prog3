//Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números são pares e quantos números são ímpares entre o primeiro e o último número digitado.
//O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int pares = 0;
        int impares = 0;

        if (n!= 0) {
            int ultimo = n;
            while (true) {
                int numero = s.nextInt();
                if (numero == 0) {
                    break;
                } else if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                ultimo = numero;
            }
            
            System.out.println("Quantidade de números pares entre " + n + " e " + ultimo + ": " + pares);
            System.out.println("Quantidade de números ímpares entre " + n + " e " + ultimo + ": " + impares);
        } else {
            System.out.println("ERRO.");
        }
        s.close();
    }
}
