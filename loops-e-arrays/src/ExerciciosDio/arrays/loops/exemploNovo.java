package ExerciciosDio.arrays.loops;

import java.util.Scanner;

public class exemploNovo {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        
    
        while(count < 5 ){
            
        System.out.println("Numero: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if (numero > maior) maior = numero;

        count++;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

        scan.close();
    
       } 
    
    }
