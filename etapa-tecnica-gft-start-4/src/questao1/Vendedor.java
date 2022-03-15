package questao1;

/**
 *
 * @author julio
 */
public class Vendedor extends Colaborador {

    public Vendedor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }
    
    @Override
    public double bonificacao() {
        return super.getSalario() + (300 * super.getGrauInstrucao() * 4);
    }
    
}
