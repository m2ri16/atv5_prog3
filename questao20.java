//Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
//dos números divisíveis por 3. O programa deve parar de ler quando o usuário digitar o número 0
//utilizando o while.
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Digite uma sequência de números inteiros, caso deseje sair, digite 0.");
        int n = s.nextInt();
        int soma = 0;
        int quant = 0;

        while (n != 0) {
            if (n % 3 == 0) {
                soma += n;
                quant++;
            }
            n = s.nextInt();
        }
        if (quant > 0) {
            double div3 = (double) soma / quant;
            System.out.println("Média dos números divisíveis por 3 é  " + div3 + ".");
        } else {
            System.out.println("Não tem número divisível por 3 na sequência.");
        }
        s.close();
    }
}
