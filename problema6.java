import java.util.Scanner;

//Exercício 6
//Leia um número inteiro e exiba o resto da divisão deste número por 2.

public class problema6{
    
    public static void main(String[] args){
        int numero;
        float resto;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o numero:");
            numero=ler.nextInt();
            resto = numero%2;
        System.out.println("o resto é:"+resto);
    }
    
}