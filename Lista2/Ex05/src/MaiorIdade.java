
import java.util.Scanner;


public class MaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com uma idade: ");
        int idade = entrada.nextInt();
        
        if(idade >= 18) System.out.println("Maior de idade");
        else System.out.println("Menor de idade");
    }
    
}
