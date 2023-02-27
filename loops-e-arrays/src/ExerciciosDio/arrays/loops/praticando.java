package ExerciciosDio.arrays.loops;

import java.util.Scanner;

public class praticando {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scan.next();

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("Autorizado");

        } else { 
            System.out.println("Não autorizado!");

        }
        
        scan.close();
}
}
  