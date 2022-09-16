import java.text.MessageFormat;

public class CalcularMetade {
    public static void main(String[] args) {
        double numero, metade;
        
        numero = 7;
        metade = numero / 2;
        
        System.out.println(MessageFormat.format("A metade de {0} é {1}", numero, metade));
    }
}
