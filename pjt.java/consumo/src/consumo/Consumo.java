 /*
 Faça a leitura da quantidade de rotas do dia. ok
 Faça a leitura da km de cada ônibus. ok 
 Calcule a quantidade necessária de combustível para atender toda a demanda. ok
 Faça leitura do valor do litro do óleo diesel.
 No final mostre o resultado de total de km, quantos litros de combustível é necessário para atender às rotas e o valor que a empresa desembolsará
 
        
   */ 
package consumo;

import java.util.Scanner;

/**
 *
 * @author aliss
 */
public class Consumo {

    /**
     * @param args the command line arguments
     */
    
  public static void main(String[] args) {
      
      
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de rotas do dia: ");
        int qtdRotas = scanner.nextInt();
        System.out.println("Quantidade de rotas do dia: " + qtdRotas);
        
        double totalKm = 0;
        
        for (int i = 1; i <= qtdRotas; i++) {
            System.out.print("Digite o km da rota " + i + ": ");
            double kmrota = scanner.nextDouble(); 
            totalKm += kmrota;
            
            
        }
    
        
       System.out.println("\n quantidade de km rodados "   + totalKm  );
       
        
       
        double diesel= 0;
        diesel = totalKm / 2.5 ;
                
       
   
        System.out.println("\nQuantidade de dieselnecessario é " + diesel);
        
        
        
        
       
        double valordiesel =diesel;
        valordiesel= valordiesel *5;
        
       
        
        System.out.println("\nvalor de diesel necessario é " + valordiesel);
        
        
        
        

        scanner.close();
        
        
        
      }
    }

    
    

