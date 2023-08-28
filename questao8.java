//Elabore um programa que calcule a soma dos números de 1 a 100 utilizando o while.
public class questao8 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0; 

        while(i <= 100){
            soma += i;
            i++;
        }
        System.out.println("A soma dos números inteiros de 1 a 100 é igual a " + soma);
    }
}
