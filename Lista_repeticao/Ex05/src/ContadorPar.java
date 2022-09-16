
public class ContadorPar {
    public static void main(String[] args) {
        int cont = 1;
        
        do
        {
            if(cont%2 == 0)
            {
                System.out.println(cont);
            }
            cont++;
        }while(cont <= 20);
    }
}
