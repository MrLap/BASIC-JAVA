/*Exercício 15
Fazer um algoritmo que possa entrar com o saldo de uma aplicação e ele imprima o novo saldo,
considerando o reajuste de 1%.*/
import java.util.Scanner;
import java.lang.Math;
public class problema15{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.printf("%n entre com o saldo");
        double saldo=scan.nextDouble();
        double reajuste=saldo+(saldo*0.01);
        System.out.printf("seu novo saldo é %.2f%n:",reajuste);
    }
}