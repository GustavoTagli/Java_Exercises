
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, mediaInd, mediaGeral=0;
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("\n" + i + "ºAluno || Nota1: ");
            nota1 = entrada.nextFloat();
            System.out.print(i + "ºAluno || Nota2: ");
            nota2 = entrada.nextFloat();
            
            mediaInd = (nota1 + nota2) / 2;
            mediaGeral += mediaInd;
        }
        System.out.println("\nMedia geral: " + mediaGeral);
    }
}
