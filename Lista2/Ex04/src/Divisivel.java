
import java.util.Scanner;


public class Divisivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int n = entrada.nextInt();
        
        if(n%3==0 && n%7==0) System.out.println("Valor é divisível por 3 e 7");
    }
}
