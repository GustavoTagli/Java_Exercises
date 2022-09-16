
import java.util.Scanner;


public class Saldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor do saldo: ");
        double saldo = entrada.nextDouble();
        double reajuste = saldo + (saldo * .15);
        
        System.out.println("Saldo com reajuste de 15%: " + reajuste);
    }
}
