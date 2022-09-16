
import java.util.Scanner;


public class LoopSessentaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdExame = 0, qtdRep = 0, qtdApro = 0;
        float nota1, nota2, media;
        
        for(int i = 1; i <= 60; i++)
        {
            System.out.print("\n" + i + "ºAluno || Nota1: ");
            nota1 = entrada.nextFloat();
            System.out.print(i + "ºAluno || Nota2: ");
            nota2 = entrada.nextFloat();
            
            media = (nota1 + nota2) / 2;
            
            if(media >= 5) qtdApro++;
            else if(media < 3) qtdRep++;
            else qtdExame++;
        }
        System.out.println("Aprovados: " + qtdApro
                         + "\nExame: " + qtdExame
                         + "\nReprovados: " + qtdRep);
    }
}
