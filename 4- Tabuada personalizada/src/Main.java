import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\\~\\~\\~\\~\\ TABUADA PERSONALIZADA /~/~/~/~/");

        char repetir;
        boolean loop = false;

        do {
            while (!loop) {
                System.out.print("\nSelecione um número inteiro positivo de 1 à 1000 para gerar a tabuada: ");
                if (scan.hasNextInt()) {
                    int numero = scan.nextInt();
                    while (numero <= 0 || numero >= 1000) {
                        System.out.println("\n      * Entrada inválida. O número inserido deve ser maior que zero e menor que mil. *\n");
                        System.out.print("Selecione um número inteiro positivo para gerar a tabuada: ");
                        numero = scan.nextInt();
                    }
                    System.out.println(" ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    loop = true;
                } else {
                    System.out.println("\n      * Entrada inválida. Você deve inserir um número inteiro positivo *");
                    scan.next();
                }
            }
            loop = false;

            System.out.print("\nDeseja gerar uma nova tabuada? (s/n): ");
            repetir = Character.toLowerCase(scan.next().charAt(0));

            while (repetir != 's' && repetir != 'n') {
                System.out.println("\n      * Entrada inválida. Você deve inserir 's' para SIM ou 'n' para NÃO*\n");
                System.out.print("Deseja gerar uma nova tabuada? (s/n): ");
                repetir = Character.toLowerCase(scan.next().charAt(0));
            }

        } while (repetir == 's');

        scan.close();
    }
}