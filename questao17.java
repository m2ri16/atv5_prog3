import java.util.Scanner;

//Elabore um programa que leia uma sequência de números inteiros do usuário e determine
//quantos números pares foram digitados antes do primeiro número ímpar. O programa deve parar
//de ler quando o usuário digitar o número 0 utilizando o while.

public class questao17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int AntesDeImpar = 0;
        boolean Impar = false;

        while (n != 0 && !Impar) {
            if (n % 2 == 0) {
                AntesDeImpar++;
            } else {
                Impar = true;
            }
            n = s.nextInt();
        }

        System.out.println("Quantidade de números pares antes do primeiro número ímpar: " + AntesDeImpar);
        s.close();
    }
}
