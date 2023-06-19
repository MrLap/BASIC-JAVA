import java.util.Scanner;

public class problema4{
    /*Exercício 4
Leia três números inteiros e exiba a soma destes números.*/

    public static void main(String[] args){
        int a, b, c;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite o numero a");
        a=ler.nextInt();
        
        System.out.println("digite o numero b");
        b=ler.nextInt();
        
        System.out.println("digite o numero c");
        c=ler.nextInt();
    
        
        System.out.println("numero a="+a );
        System.out.println("numero b="+b );
        System.out.println("numero c="+c);
    }
    
    
}