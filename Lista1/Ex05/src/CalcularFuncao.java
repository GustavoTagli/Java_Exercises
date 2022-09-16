
import java.util.Scanner;


public class CalcularFuncao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor de X: ");
        double x = entrada.nextDouble();
        double y = (3 * x) + 2;
        
        System.out.println("y(x) = " + y);
    }
}
