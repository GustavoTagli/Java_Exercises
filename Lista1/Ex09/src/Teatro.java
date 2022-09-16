
import java.util.Scanner;


public class Teatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o custo do Espetáculo: ");
        float custo = entrada.nextFloat();
        System.out.print("Entre com o valor do Ingresso: ");
        float ingresso = entrada.nextFloat();
        
        float qtd = custo / ingresso;
        
        System.out.println("A quantidade mínima de ingressos é: " + Math.ceil(qtd));
    }
}
