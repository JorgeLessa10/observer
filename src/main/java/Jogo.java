/*
 ** created by: jorge.lessa
 */
public class Jogo {

    private String nome;
    private Double valorDiaria;

    public Jogo(String nome, Double valorDiaria) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
