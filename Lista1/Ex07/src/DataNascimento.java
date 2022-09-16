
import java.util.Scanner;


public class DataNascimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);;
        
        System.out.print("Entre com o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        System.out.print("Entre com o ano atual: ");
        int anoAtual = entrada.nextInt();
        
        int idade = anoAtual - anoNascimento;
        int idadef = 2040 - anoNascimento;
        
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Em 2040 você terá " + idadef + " anos");
    }
}
