package ExerciciosDio.arrays.loops;

import java.util.Scanner;

public class fome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fome;

        System.out.println("Qual o tamanho da sua fome? ");
        fome = scan.nextInt();

        if (fome > 10){

            System.out.println("Voce está com muita fome! ");

        }else{
            System.out.println("voce esta com pouca fome! ");

        }

        scan.close();
    }
}
