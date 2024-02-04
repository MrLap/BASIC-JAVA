import java.util.Scanner;

    /*Exercício 11
Leia dois números inteiros, a e b, e faça com que eles troquem os valores entre si. 
Exiba os valores
de a e b.*/

public class problema11{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,aux;
        System.out.printf("entre com valor de a:\n");
        a=scanner.nextInt();
        System.out.printf("entre com valor de b:\n");
        b=scanner.nextInt();
        aux=a;
        a=b;
        b=aux;
        System.out.printf("valor de a:%n"+a+"%nvalor de b%n:"+b);
    }
}
