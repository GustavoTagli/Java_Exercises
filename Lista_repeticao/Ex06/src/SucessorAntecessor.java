
import java.util.Scanner;


public class SucessorAntecessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        
        do
        {
            System.out.println("Digite o " + i + " valor: ");
            int n = entrada.nextInt();
            System.out.println("Sucessor: " + (n+1) + "  // Antecessor: " + (n-1));
            i++;
        }while(i <= 5);
    }
}
