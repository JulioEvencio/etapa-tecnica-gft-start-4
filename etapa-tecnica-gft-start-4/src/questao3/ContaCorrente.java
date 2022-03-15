package questao3;

/**
 *
 * @author julio
 */
public class ContaCorrente extends Conta {
    
    private final double MANUTENCAO = 0.75;

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public double getMANUTENCAO() {
        return MANUTENCAO;
    }

    @Override
    public double rendimento() {
        return super.getSaldo() * 0.05 - MANUTENCAO;
    }
    
}
