//Faça um programa que calcule o produto dos números de 1 a 5 utilizando o while.

public class questao9 {
    public static void main(String[] args) {
    int n = 1;
    int multi = 1;

    while (n <= 5) {
        multi *= n;
        n++;
    }
    System.out.println("O produto dos números é " + multi + ".");
    }
}
