import java.util.Scanner;

//Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números são divisíveis por 2, quantos são divisíveis por 3 e quantos são divisíveis por 5. O
//programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
public class questao19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int div2  = 0;
        int div3 = 0; 
        int div5 = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                div2++;
            }
            if (n % 3 == 0) {
                div3++;
            }
            if (n % 5 == 0) {
                div5++;
            }
            n = s.nextInt();
        }

        System.out.println("Números divisíveis por 2: " + div2);
        System.out.println("Números divisíveis por 3: " + div3);
        System.out.println("Números divisíveis por 5: " + div5);
        s.close();
    }
}
