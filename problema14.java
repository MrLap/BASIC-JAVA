import java.util.Scanner;
import java.lang.Math;
public class problema14{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("entre com a base e depois com o expoente");
        double base=scan.nextFloat();
        double expoente=scan.nextFloat();
        double resultado=Math.pow(base,expoente);
        System.out.println("a potencia é:"+resultado);
    }
}