import java.util.Scanner;

        /*Exercício 10
        Leia uma temperatura em ºC, calcule e exiba a correspondente em ºF (Wikipédia!).*/

public class problema10{
        
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float convertido, celsius, farenheit;
        /*a conversão de celsius para farenheit se da por: (C°*9/5)+32= fahrenheit */
        System.out.println("digite a temperatura em celsius");
            celsius=ler.nextFloat();
            convertido=((celsius*9/5)+32);
        System.out.println("a temperatura em fahrenheit é:"+convertido);
                
                
        }
        }

