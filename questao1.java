//Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior
//ou igual a 7).
import java.util.Scanner;

public class questao1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite a nota do aluno: ");
            double nota = s.nextDouble();

            if (nota >= 7) {
                System.out.println("Você foi aprovado!");
            } else {
                System.out.println("Você foi reprovado.");
            }
            s.close();
        }
    }
}