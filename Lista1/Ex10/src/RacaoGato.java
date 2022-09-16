
import java.util.Scanner;


public class RacaoGato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Peso do saco de ração(Kg): ");
        float peso = entrada.nextFloat();
        System.out.print("Consumo de ração diária(g) do 1º gato: ");
        float consumo1 = entrada.nextFloat();
        System.out.print("Consumo de ração diária(g) do 2º gato: ");
        float consumo2 = entrada.nextFloat();
        
        peso = peso * 1000;
        
        float total = 5 * (consumo1 + consumo2);
        float resto = peso - total;
        resto = resto / 1000;
        
        System.out.println("Sobrará " + resto + "Kg após 5 dias");
    }
}
