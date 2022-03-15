package questao1;

/**
 *
 * @author julio
 */
public class Supervisor extends Colaborador {

    public Supervisor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }
    
    @Override
    public double bonificacao() {
        return super.getSalario() + (500 * super.getGrauInstrucao() * 3);
    }
    
}
