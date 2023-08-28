import java.util.Scanner;

//Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior
//ou igual a 7) utilizando o while.
public class questao16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int aprovados = 0;
        System.out.print("Digite as notas: ");

        while (i < 5) {
            int nota = s.nextInt();
            if (nota >= 7) {
                aprovados ++;
            } 
            i++;
        }
        System.out.println("A quantidade de alunos aprovados foram " + aprovados + ". ");
        s.close();
    }
}
