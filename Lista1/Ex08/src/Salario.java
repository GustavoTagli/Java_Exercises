
import java.util.Scanner;


public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o salário: ");
        double salario = entrada.nextDouble();
        System.out.print("Entre com o percentual de aumento: ");
        double taxa = entrada.nextDouble();
        
        double novoSalario = salario + (salario * (taxa / 100));
        
        System.out.println("Aumento: " + novoSalario);
    }
}
