import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner( System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String Sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá, me chamo " + nome + " "  + Sobrenome);
        System.out.println("Minha altura é " + altura + "cm ");
        System.out.println("Tenho " + idade + " anos ");

        scanner.close();
    }

}
