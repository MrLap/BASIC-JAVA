/*Exercício 13
Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos são
respectivamente: 1, 2, 3 e 4.*/
import java.util.Scanner;
public class problema13{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("%nentre com 4 numeros:");
        float a=scan.nextFloat();
        float b=scan.nextFloat();
        float c=scan.nextFloat();
        float d=scan.nextFloat();
        float mediaPonderada=(1*a+2*b+3*c+4*d)/10;
        System.out.printf("a media poderada é%n:"+mediaPonderada);
        
    }
}