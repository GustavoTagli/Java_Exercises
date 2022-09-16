
import java.util.Scanner;


public class MenuCalculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o 1º valor: ");
        float x = entrada.nextFloat();
        System.out.print("Entre com o 2º valor: ");
        float y = entrada.nextFloat();
        
        System.out.println("\n[1] Média entre os dois números"
                       + "\n[2] A soma dos dois números"
                       + "\n[3] O produto entre os dois números");
        int op = entrada.nextInt();
        
        switch(op) {
            case 1: System.out.println((x + y) / 2);
                    break;
            case 2: System.out.println(x + y);
                    break;
            case 3: System.out.println(x * y);
                    break;
            default: System.out.println("Opção inválida!");
        }
    }
    
}
