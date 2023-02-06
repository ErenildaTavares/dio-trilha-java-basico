public class operadores2 {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira?");
        }

        System.out.println("numerum é igual a numerodois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numerum é diferente do numerodois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numerum é maior que numerodois? " + simNao);
    }
}
