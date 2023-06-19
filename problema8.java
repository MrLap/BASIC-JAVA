import java.util.Scanner;

/*Exercício 8
Leia as notas de quatro provas de um concurso: Matemática, Português, Conhecimentos Gerais e
Informática. Calcule e exiba a média ponderada tendo Matemática como peso 2.*/

public class problema8{
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float pm,pp,pc,pi, mediaPonderada;
        System.out.println("digite a nota de matemática..........:");
            pm = ler.nextFloat();
        System.out.println("digite a nota de portugues...........:");
            pp = ler.nextFloat();
        System.out.println("digite a nota de conhecimentos gerais:");
            pc = ler.nextFloat();
        System.out.println("digite a nota de informática.........:");
            pi = ler.nextFloat();
            
            mediaPonderada=(((2*pm)+pp+pc+pi)/(2+1+1+1));
        System.out.println("a média ponderada é:"+mediaPonderada);
                
    }
}