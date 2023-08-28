import java.util.Scanner;

//Crie um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números pares e quantos números ímpares foram digitados. O programa deve parar de ler quando
//o usuário digitar o número 0 utilizando o while.
public class questao18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int par = 0;
        int impar = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            
            n = s.nextInt();
        }
        System.out.println("Quantidade de números pares: " + par + ".");
        System.out.println("Quantidade de números ímpares: " + impar + ".");
        s.close();
    }

}


