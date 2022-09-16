import java.text.MessageFormat;
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o 2º valor: ");
        int n2 = entrada.nextInt();
        
        double media = (n1 + n2) / 2;
        
        System.out.println(MessageFormat.format("Sua média é {0}", media));
    }
}
