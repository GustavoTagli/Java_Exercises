
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
         int i = 1;

        do
        {
            Media(i);
            i++;
        }while(i <= 10);
    }
    
    static void Media(int nAluno) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Aluno " + nAluno + " // Digite a 1º nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Aluno " + nAluno + " // Digite a 2º nota: ");
        nota2 = entrada.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("Aluno " + nAluno + " // Sua media = " + media + "\n");
    }
}
