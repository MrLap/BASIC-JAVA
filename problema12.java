import java.util.Scanner;
    
    /*Exercício 12
Ler um número inteiro e imprimir seu sucessor e seu antecessor.*/
    
    public class problema12{
        public static void main(String[]args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("entre com o numero:");
            int n = scanner.nextInt(),aux;
            aux=n+1;
            System.out.printf("%nantecessor="+ aux);
            aux=n-1;
            System.out.printf("%n sucessor="+ aux);
            }
    }
    