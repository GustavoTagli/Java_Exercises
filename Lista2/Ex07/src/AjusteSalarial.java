
import java.util.Scanner;


public class AjusteSalarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com o salário: ");
        float sal = entrada.nextFloat();
        
        if(sal <= 300)
        {
            sal += (sal * 0.35);
            System.out.println(sal);
        }
        else 
        {
            sal += (sal * 0.15);
            System.out.println(sal);
        }
    }
}
