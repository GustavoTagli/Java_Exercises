
import java.util.Scanner;


public class MediaAltura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float soma = 0, altuta, media;
        for(int i=1; i <= 5; i++)
        {
            System.out.println("Altura da " + i + "º pessoa: ");
            float altura = entrada.nextFloat();
            soma += altura;
        }
        media = soma / 5;
        System.out.println("A media das alturas = " + media);
    }
}
