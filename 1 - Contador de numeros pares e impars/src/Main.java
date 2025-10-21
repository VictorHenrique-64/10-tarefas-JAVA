import java.util.Scanner;

public class Main {
    public static void main(String [] main) {
        Scanner scan = new Scanner(System.in);

        int limite;
        char sim = 's';
        char repetir;

        System.out.println("\n  \\~\\~\\~\\~\\  Bem Vindo ao sistema de contar par/ímpar.  /~/~/~/~/");

        do {
            System.out.print("\nSelecione qual será o número limite do contador: ");
            limite = scan.nextInt();
            System.out.print("\n");
            for (int cont = 1; cont <= limite ; cont++) {
                if (cont % 2 != 0) {
                    System.out.println(cont + " - Ímpar");
                } else {
                    System.out.println(cont + " - Par");
                }
            }
            System.out.print("Gostaria de repetir? (s/n): ");
            repetir = scan.next().charAt(0);


        } while (repetir == 's' || repetir == 'S');
    }
}