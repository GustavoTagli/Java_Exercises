
import java.text.MessageFormat;


public class SomarNumeros {
    public static void main(String[] args) {
        int num1 = 4, num2 = 6, soma;
        
        soma = num1 + num2;
        
        System.out.println(MessageFormat.format("A soma de {0} + {1} é {2}", num1, num2, soma));
    }
}
