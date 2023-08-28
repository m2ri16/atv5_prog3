//Desenvolva um programa que exiba todos os múltiplos de 3 no intervalo de 1 a 50 utilizando o while.
public class questao15 {
    public static void main(String[] args) {
        int n = 1;
        
        while (n <= 50) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
            n ++;
        }
    }
}
