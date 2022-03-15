package questao3;

/**
 *
 * @author julio
 */
public class Run {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1, "Fulano", 300);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, "Ciclano", 150);

        System.out.println(contaCorrente.toString());
        System.out.println(contaPoupanca.toString());
    }

}
