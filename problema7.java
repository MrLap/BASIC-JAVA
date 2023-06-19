import java.util.Scanner; 
//Exercício 7
//Leia dois números inteiros (dividendo e divisor, respectivamente) e exiba a divisão, a divisão inteira e
//o resto da divisão destes números.

public class problema7{
    public static void main (String[] args){
        int dividendo,divisor;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o dividendo");
        dividendo = ler.nextInt();
        System.out.println("digite o divisor");
        divisor = ler.nextInt();
        float dividendof=dividendo;
        float divisorf=divisor;
        float divisao =(dividendof/divisorf);
        System.out.println("a divisão é:"+(divisao));   
        System.out.println("a divisão inteira é:"+ (dividendo/divisor));   
        System.out.println("o resto da divisão é:"+ (dividendo % divisor));
    }
    
}