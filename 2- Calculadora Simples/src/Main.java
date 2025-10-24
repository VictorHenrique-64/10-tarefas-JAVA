import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n \\~\\~\\~\\~\\ CALCULADORA SIMPLES /~/~/~/~/\n");

        char repetir;
        int num1 = 0;
        int num2 = 0;
        boolean validacao = false;
        int operacao = 0;

        do {
            while (!validacao) {
                System.out.print("Digite o primeiro número: ");
                if (scan.hasNextInt()) {
                    num1 = scan.nextInt();
                    validacao = true;
                } else {
                    System.out.println("\n    * O valor inserido deve ser um número inteiro *\n");
                    scan.next();
                }
            }
            System.out.println(" ");
            validacao = false;

            while (!validacao) {
                System.out.println("(1) Adição - (2) Subtração - (3) Multiplicação - (4) Divisão");
                System.out.print("Selecione qual operação deseja usar nesse calculo: ");
                if (scan.hasNextInt()) {
                    operacao = scan.nextInt();
                    if (operacao > 4 || operacao < 1) {
                        System.out.println("\n    * O valor inserido é inválido, Você deve selecionar uma das quatro operações (1-4) *\n");
                    } else {
                        validacao = true;
                    }
                } else {
                    System.out.println("\n    * O valor inserido é inválido, Você deve selecionar uma das quatro operações (1-4) *\n");
                    scan.next();
                }
            }

            validacao = false;

            while (!validacao) {
                System.out.print("Digite o segundo número: ");
                if (scan.hasNextInt()) {
                    num2 = scan.nextInt();
                    validacao = true;
                } else {
                    System.out.println("\n    * O valor inserido deve ser um número inteiro *\n");
                    scan.next();
                }
            }

            validacao = false;

            switch (operacao) {
                case 1:  // Adição
                    System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case 2:  // Subtração
                    System.out.println("\n" + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:  // Multiplicação
                    System.out.println("\n" + num1 + " x " + num2 + " = " + (num1 * num2));
                    break;

                case 4:  // Divisão
                    while (num2 <= 0) {
                        System.out.println("\n* O segundo número deve ser maior que zero *\n");
                        while (!validacao) {
                            System.out.print("Digite o segundo número: ");
                            if (scan.hasNextInt()) {
                                num2 = scan.nextInt();
                                validacao = true;
                            } else {
                                System.out.println("\n    * O valor inserido deve ser um número inteiro *\n");
                                scan.next();
                            }
                        }
                    }
                    System.out.println("\n" + num1 + " ÷ " + num2 + " = " + (num1 / num2));
                    break;
            }

            System.out.print("Gostaria de fazer um novo calculo? (s/n): ");
            repetir = scan.next().charAt(0);
            while (repetir != 's' && repetir != 'S' && repetir != 'n' && repetir != 'N') {
                System.out.println("\n    * Resposta inválida *\n");
                System.out.print("Gostaria de fazer um novo calculo? (s/n): ");
                repetir = scan.next().charAt(0);
            }


        }
        while (repetir == 's' || repetir == 'S');
    }
}