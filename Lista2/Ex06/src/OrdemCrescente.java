
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o 1º número: ");
        int a = entrada.nextInt();
        System.out.print("Entre com o 2º número: ");
        int b = entrada.nextInt();
        
        if(a < b) System.out.println(a + ", " + b);
        else System.out.println(b + ", " + a);
    }
}
