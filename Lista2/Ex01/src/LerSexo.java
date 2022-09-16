import java.util.Scanner;

public class LerSexo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o sexo (F/M):");
        char sexo = entrada.next().charAt(0);

        if(sexo == 'F' || sexo == 'f') System.out.println("Feminino");
        else if(sexo == 'M' || sexo == 'm') System.out.println("Masculino");
    }
}