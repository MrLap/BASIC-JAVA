public class problema1{
    /* Dê o resultado das expressões abaixo:
    (a) int a = 26/6/2 – 127 / 7 % 5;
    (b) int b = 7 % 4 – 8 / (3+1);
    (c) int c = 7 % 9;
    (d) int d = (7 % 4) – 8) / (3+1); */
    public static void main(String[]args){
        int a = ((26/6)/2)-((127/7)%5);
        int b = ((7%4)-8)/(3+1);
        int c = (7%9);
        int d = ((7%4)-8)/(3+1); 
        
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
    }
}