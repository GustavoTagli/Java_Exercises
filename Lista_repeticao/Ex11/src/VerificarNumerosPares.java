
import java.util.Scanner;


public class VerificarNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numPares = 0;
        
        for(int i = 1; i<=30; i++)
        {
            System.out.print(i + "º Número: ");
            int n = entrada.nextInt();
            
            if(n%2 == 0)
            {
                numPares ++;
            }
        }
        System.out.println("Foram digitados " + numPares + " números pares");
    }
}
