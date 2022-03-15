package questao1;

/**
 *
 * @author julio
 */
public class Gerente extends Colaborador {

    public Gerente(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }
    
    @Override
    public double bonificacao() {
        return super.getSalario() + (1000 * super.getGrauInstrucao() * 2);
    }
    
}
