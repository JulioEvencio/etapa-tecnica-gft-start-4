package questao4;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Run {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nome: ");
            p.setNome(input.nextLine());
            
            System.out.print("Altura: ");
            // Lendo String e depois convertendo para evitar bug com sujeira no buffer
            p.setAltura(Double.parseDouble(input.nextLine()));
            
            System.out.print("Peso: ");
            // Lendo String e depois convertendo para evitar bug com sujeira no buffer
            p.setPeso(Double.parseDouble(input.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Erro ao ler dados!");
            return;
        }
        
        System.out.println(p.toString());
    }
    
}
