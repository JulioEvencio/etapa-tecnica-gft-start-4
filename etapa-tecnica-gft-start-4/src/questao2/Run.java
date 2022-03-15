package questao2;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Run {

    public static void main(String[] args) {
        String numero;
        int impares = 0;

        try ( Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Número: ");
                numero = input.nextLine();

                if (Integer.parseInt(numero) < 100) {
                    System.out.println("O número precisa ter 3 digitos!!");
                    continue;
                } else if (Integer.parseInt(numero) < 350 || Integer.parseInt(numero) > 8750) {
                    System.out.println("O precisa estar entre 350 a 8750!");
                    continue;
                }

                break;
            } while (true);

        } catch (NumberFormatException e) {
            System.out.println("Digite apenas numeros!");
            return;
        }

        try {
            for (int i = 0; i < 4; i++) {
                if (numero.charAt(i) % 2 != 0) {
                    impares++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            //
        }

        System.out.println("Números ímpares: " + impares);

    }
}
