
import java.util.Scanner;
public class Controle 
{

    public static void main(String[] args) 
    {

        int valor;
      
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite um valor");
        valor = leitura.nextInt();
        
        switch (valor) 
        {
            case 1:
                  System.out.println("Valor = 1");
                  break;
            
            case 2: 
                  System.out.println("Valor = 2 ");
                  break;

            case 3: 
                  System.out.println("Valor = 3 ");
                  break;
                
            default:
               System.out.println("Nenhum dos valores");

        }
    }
}