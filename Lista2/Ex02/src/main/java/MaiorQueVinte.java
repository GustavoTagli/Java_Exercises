
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
public class MaiorQueVinte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        int n = entrada.nextInt();
        
        if(n > 20) System.out.println("Maior do que 20");
    }
}
