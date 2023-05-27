
package sp.senai.br.lacosomadenumeros;

import java.util.Scanner;

public class Atividade1 
{
    
     public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);   
       
        double media = 0;
        
        int i = 0;
        int soma = 0;
        int mubers;
        int pergunta = 0;
        
        while( i <= 9)
        {
            System.out.printf("digite %d° valor: \n",i + 1);
            pergunta = teclado.nextInt();
            
            if(pergunta <= 0)
            {
                System.out.println("O numero digitado e menor ou igual a 0");
                i--;
            }
            soma = pergunta + i  ;
            
            
            media = soma / (pergunta + i);
            
            
            i++;
        }
        System.out.printf("A soma dos numeros e: %d e a media e de %.1f", soma, media);
    }
}
