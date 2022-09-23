
import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1[] = new int[5];
        int num2[] = new int[5];
        int soma1 = 0, soma2 = 0;

        for(int i = 0; i < num1.length; i++)
        {
            System.out.print("(1º Elemento) Digite o " + (i+1) + " valor: ");
            num1[i] = entrada.nextInt();
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < num2.length; i++)
        {
            System.out.print("(2º Elemento) Digite o " + (i+1) + " valor: ");
            num2[i] = entrada.nextInt();
        }
        
        for(int i : num1)
        {
            soma1 += i;
        }
        
        for(int i : num2)
        {
            soma2 += i;
        }
        
        System.out.println("\nSoma do elemento 1 = " + soma1 + "// Soma do elemento 2 = " + soma2);
        
        
    }
}
