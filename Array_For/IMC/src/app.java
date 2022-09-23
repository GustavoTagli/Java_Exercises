
import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float infos[][] = new float[5][2];
        float imc[] = new float[5];
        
        for(int i = 0; i < infos.length; i++)
        {
            System.out.println((i+1) + "º Pessoa");
            System.out.print("Seu peso: ");
            infos[i][0] = entrada.nextFloat();
            System.out.print("sua altura: ");
            infos[i][1] = entrada.nextFloat();
        }
        
        for(int i = 0; i < infos.length; i++)
        {
            imc[i] = infos[i][0] / (infos[i][1] * infos[i][1]);
        }
        
        for(int i = 0; i < infos.length; i++)
        {
            System.out.println((i+1) + "º Pessoa seu imc é: " + imc[i]);
        }
    }
}
