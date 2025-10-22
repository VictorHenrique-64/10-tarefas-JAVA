import java.util.Scanner;       //é importado o SCANNER da biblioteca Java API (java.util)

public class Main {
    public static void main(String[] main) {
        Scanner scan = new Scanner(System.in);      // Aqui estou abrindo um novo scanner para que o usuário possa interagir com o sistema

        char repetir;       // Eu abri um CHAR fora do DO pois o WHILE não identificaria essa variavel no final

        System.out.println("\n  \\~\\~\\~\\~\\  CONTADOR DE NÚMEROS PARES E ÍMPARES  /~/~/~/~/");       // Esse print é a primeira coisa que aparece ao iniciar o sistema

        do {        // Aqui eu abri o DO do DO WHILE, ele irá servir para repetir o codigo
            System.out.print("\nSelecione qual será o número limite do contador: ");
            int limite = scan.nextInt();        // O usúario irá inserir o limite do contador nesse scan
            while (limite <= 0) {       //aqui é um looping, enquanto o limite for menor ou igual à zero, o while irá repetir o que está dentro dele.
                System.out.println("*Você deve inserir um número maior que 0.*");
                System.out.print("\nSelecione qual será o número limite do contador: ");
                limite = scan.nextInt();
            }       // Esse é o fechamento do while, o usuário inseriu um valor maior que zero
            System.out.print("\n");     //quebra de linha
            for (int cont = 1; cont <= limite; cont++) {       //Aqui que começa, a variavel 'cont' recebe 1 inicialmente, enquanto o cont for menor que 'limite', ele irá receber 1, somando com o valor anterior até chegar no valor do limite, finalizando loop.
                if (cont % 2 != 0) {        //se a divisão de 'cont' com 2 restar um valor diferente de 0...
                    System.out.println(cont + " - Ímpar");      //Será impresso o valor de 'cont' com a escrita ' - impar', representando que o valor de 'cont' é ímpar
                } else {        //Se não (caso o resto da divisão for igual a zero)...
                    System.out.println(cont + " - Par");        //Será impresso o valor de 'cont' com a escrita ' - par', representando que o valor de 'cont' é par
                }
            }
            System.out.print("Gostaria de repetir? (s/n): ");
            repetir = scan.next().charAt(0);        //A variavel 'repetir' já existente fora do DO irá receber do usuário um caracter único que representará se o usuário gostaria de repetir o sistema
            while (repetir != 's' && repetir != 'S' && repetir != 'n' && repetir != 'N') {      //Enquanto o valor do 'repetir' for diferente de 's', 'S', 'n' e 'N', o while irá repetir o que está dentro dele.
                System.out.println("*Resposta inválida*");
                System.out.print("Gostaria de repetir? (s/n): ");
                repetir = scan.next().charAt(0);
            }


        } while (repetir == 's' || repetir == 'S');         //Aqui é o fechamento do DO WHILE, ele será repetido caso o usuário inseriu o valor 's' ou 'S' na variavel 'repetir'

        scan.close();       //fechamento do scanner, é importante sempre definir aonde se fecha o scanner.
    }
}