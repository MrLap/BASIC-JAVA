import java.util.Scanner;

public class problema5{
/*Exercício 5
Leia duas notas semestrais inteiras e exiba a média anual.*/

    public static void main (String[] args){
        float n1,n2,media;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite n1");
        n1=ler.nextFloat();
        System.out.println("digite n2");
        n2=ler.nextFloat();
        media=(n1+n2)/2;
        System.out.println("a media é:"+media);
    }
}