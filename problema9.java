 import java.util.Scanner;
 
     /*Exercício 9
        Leia um valor inteiro e mostre seu inverso. O inverso de x é 1/x.*/
 
     public class problema9{
         
         public static void main(String[]args){
             Scanner ler = new Scanner(System.in);
             int inteiro;
             float inverso;
             
             System.out.println("digite um inteiro");
             inteiro = ler.nextInt();
             float convertInteiro=inteiro;
             inverso = 1/convertInteiro;
             System.out.println("o inverso é:"+inverso);
             
         }
     }