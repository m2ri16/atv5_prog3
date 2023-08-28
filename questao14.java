//Faça um programa que exiba os números ímpares de 1 a 100 utilizando o while.
public class questao14 {
    public static void main(String[] args) {
        int n = 1;

        while (n <= 100) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
            n ++; 
        }
    }
}
