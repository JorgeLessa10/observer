import java.util.Date;
import java.util.Observable;

/*
 ** created by: jorge.lessa
 */
public class Locacao extends Observable {

    private Jogo jogo;
    private Date dataDeInicio;
    private Integer quantidadeDeDias;

    public Locacao(Jogo jogo, Date dataDeInicio, Integer quantidadeDeDias) {
        this.jogo = jogo;
        this.dataDeInicio = dataDeInicio;
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Integer getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(Integer quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public void alugarJogo()
    {
        setChanged();
        notifyObservers(jogo.getNome());
    }
}
