//Crie um programa que exiba a tabuada do 9 utilizando o while.
public class questao10 {
    public static void main(String[] args) {
        int n = 9;
        int multi = 1;
        
        while (multi <= 10){
        int resultado = multi * n; 
        System.out.println(resultado);
        multi ++; 
        }
    }
}
