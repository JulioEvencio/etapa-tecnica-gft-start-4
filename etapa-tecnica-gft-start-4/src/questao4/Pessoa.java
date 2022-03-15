package questao4;

/**
 *
 * @author julio
 */
public class Pessoa {

    private String nome;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double indiceMassaCorporal() {
        return peso / Math.pow(altura, 2);
    }

    @Override
    public String toString() {
        String s = "Nome: " + nome
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nÍndice de massa corporal: " + this.indiceMassaCorporal();
        
        if (this.indiceMassaCorporal() < 18.5) {
            s += "\nCategoria: Abaixo do peso";
        } else if (this.indiceMassaCorporal() <= 24.9) {
            s += "\nCategoria: Peso normal";
        } else if (this.indiceMassaCorporal() <= 29) {
            s += "\nCategoria: Sobrepeso";
        } else if (this.indiceMassaCorporal() <= 34.9) {
            s += "\nCategoria: Obesidade Grau I";
        } else if (this.indiceMassaCorporal() <= 39.9) {
            s += "\nCategoria: Obesidade Grau II";
        } else {
            s += "\nCategoria: Obesidade Grau III";
        }
        
        return s;
    }
    
}
