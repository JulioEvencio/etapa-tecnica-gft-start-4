package questao3;

/**
 *
 * @author julio
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return super.getSaldo() * 0.07;
    }
}
