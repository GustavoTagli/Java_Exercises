
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author autologon
 */
public class AdicaOMaiorDez {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o 1º valor:");
        int a = entrada.nextInt();
        System.out.print("Entre com o 2º valor: ");
        int b = entrada.nextInt();
        
        int soma = a + b;
        
        if(soma > 10) System.out.println("Resultado da soma é " + soma);
    }
}
