
import java.text.MessageFormat;


public class CalcularDobro {
    public static void main(String[] args) {
        int num, dobro;
        num = 5;
        dobro = num * 2;
        
        System.out.println(MessageFormat.format("O dobro do número {0} é {1}", num, dobro));
    }
}
