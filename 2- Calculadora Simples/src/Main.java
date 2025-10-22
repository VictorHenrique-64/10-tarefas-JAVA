import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n \\~\\~\\~\\~\\ CALCULADORA SIMPLES /~/~/~/~/");

        char[] operacao = {'+', '-', 'x', '÷'};
        char repetir;

        do {
            System.out.print("__ __ __ = __");
            System.out.print("Digite o primeiro número: ");
            int num1 = scan.nextInt();

            System.out.println(num1 + " __ __ = __");
            System.out.println("(1) Adição - (2) Subtração - (3) Multiplicação - (4) Divisão");
            System.out.print("Selecione qual operação deseja nesse calculo: ");
            int numOperacao = scan.nextInt();

            System.out.println(num1 + " " + operacao[numOperacao] + " __ = __");
            System.out.print("Digite o segundo número: ");
            int num2 = scan.nextInt();

            switch (numOperacao) {
                case 1:  // Adição
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case 2:  // Subtração
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:  // Multiplicação
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;

                case 4:  // Divisão
                    System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                    break;
            }

            System.out.println("Gostaria de fazer um novo calculo? (s/n): ");
            repetir = scan.next().charAt(0);


        } while (repetir == 's' || repetir == 'S');
    }
}