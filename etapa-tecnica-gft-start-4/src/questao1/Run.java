package questao1;

/**
 *
 * @author julio
 */
public class Run {
    
    public static void main(String[] agrs) {
        Gerente gerente = new Gerente("Fulano", 35, 20.00, 5);
        Supervisor supervisor = new Supervisor("Ciclano", 30, 10.00, 3);
        Vendedor vendedor = new Vendedor("Beltrano", 25, 5.00, 2);
        
        System.out.println(gerente.toString());
        System.out.println(supervisor.toString());
        System.out.println(vendedor.toString());
    }
    
}
