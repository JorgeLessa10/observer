import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

/*
 ** created by: jorge.lessa
 */
public class Usuario implements Observer {

    private String nome;
    private String ultimaNot;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void observador(Locacao locacao)
    {
        locacao.addObserver(this);
    }

    public String getUltimaNot() {
        return ultimaNot;
    }

    public void setUltimaNot(String ultimaNot) {
        this.ultimaNot = ultimaNot;
    }

    @Override
    public void update(Observable locacao, Object arg) {
        this.ultimaNot = "Jogo: " + arg.toString() + " alugado";
    }
}
