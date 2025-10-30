import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\\~\\~\\~\\~\\ JOGO DE ADIVINHAÇÃO /~/~/~/~/\n");

        char repetir;
        boolean cheat = false;

        do {
            double random = Math.random();
            int numAleatorio = (int) (1 + random * 100);  //numero aleatorio gerado de 1 à 100
            int resposta = 0;
            int chances = 5;

            while (resposta != numAleatorio && chances != 0) {
                if (chances == 1) {
                    System.out.println("Última chance!");
                } else {
                    System.out.println("Chances: " + chances);
                }
                if (cheat == true) {
                    System.out.println("Número secreto: " + numAleatorio + ".");
                }
                System.out.print("Escolha um número de 1 à 100: ");
                if (scan.hasNextInt()) {
                    resposta = scan.nextInt();
                    if (resposta == -64) {
                        if (cheat == false) {
                            System.out.println("\n      * CHEAT ACTIVATED *\n");
                            cheat = true;
                        } else {
                            System.out.println("\n      * CHEAT DEACTIVATED *\n");
                            cheat = false;
                        }
                    } else if (resposta <= 0 || resposta > 100) {
                        System.out.println("\n      * Você deve inserir um número inteiro de 1 à 100, tente novamente. *\n");
                    } else if (resposta > numAleatorio) {
                        System.out.println("\nO número secreto é MENOR\n");
                        chances--;
                    } else if (resposta < numAleatorio) {
                        System.out.println("\nO número secreto é MAIOR\n");
                        chances--;
                    } else {
                        System.out.println("\nParabéns, você acertou o número secreto! (" + numAleatorio + ")\n");
                    }
                } else {
                    System.out.println("\n      * Você deve inserir um número inteiro de 1 à 100, tente novamente. *\n");
                    scan.next();
                }
                if (chances == 0) {
                    System.out.println("Você perdeu, o número secreto é: " + numAleatorio + ".\n");
                }
            }

            System.out.print("Gostaria de jogar novamente? (s/n): ");
            repetir = scan.next().charAt(0);

            while (repetir != 's' && repetir != 'S' && repetir != 'n' && repetir != 'N') {
                System.out.println("\n    * Resposta inválida *\n");
                System.out.print("Gostaria de jogar novamente? (s/n): ");
                repetir = scan.next().charAt(0);

            }
        } while (repetir == 's' || repetir == 'S');

        scan.close();
    }
}