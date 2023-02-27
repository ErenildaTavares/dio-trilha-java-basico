package ExerciciosDio.arrays.loops;

import java.util.Scanner;

/*
 Faça um programa que peça uma nota entre 0 e 10.
 Mostre uma mensagem caso o valor seja invalido
 e continue pedindo até que o usuario informe um valor válido.
 */

public class exNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();

        }
        
        scan.close();
    }

}
