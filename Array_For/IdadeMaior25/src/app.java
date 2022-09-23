
import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade[] = new int[30];
        int count = 0;
        
        for(int i = 0; i < idade.length; i++)
        {
            System.out.print((i+1) + "º Aluno, sua idade: ");
            idade[i] = entrada.nextInt();
        }
        
        for (int i : idade){
            if(i > 25) count++;
        };
        
        System.out.println("Maiores de 25 anos: " + count);
    }
}
