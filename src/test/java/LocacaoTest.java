import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 ** created by: jorge.lessa
 */
class LocacaoTest {

    @Test
    void deveNotificarUsuario()
    {
        Usuario administrador = new Usuario("Jorge");
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        Locacao locacao = new Locacao(j1, new Date(), 5);
        administrador.observador(locacao);
        locacao.alugarJogo();
        assertEquals("Jogo: " + j1.getNome() + " alugado", administrador.getUltimaNot());
    }

    @Test
    void deveNotificarUsuarios()
    {
        Usuario administrador = new Usuario("Jorge");
        Usuario administrador2 = new Usuario("Rodrigo");
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        Locacao locacao = new Locacao(j1, new Date(), 5);
        administrador.observador(locacao);
        administrador2.observador(locacao);
        locacao.alugarJogo();
        assertEquals("Jogo: " + j1.getNome() + " alugado", administrador.getUltimaNot());
        assertEquals("Jogo: " + j1.getNome() + " alugado", administrador2.getUltimaNot());
    }

    @Test
    void naoNotificarTodosUsuarios()
    {
        Usuario administrador = new Usuario("Jorge");
        Usuario cliente = new Usuario("Walter");
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        Locacao locacao = new Locacao(j1, new Date(), 10);
        administrador.observador(locacao);
        locacao.alugarJogo();
        assertEquals("Jogo: " + j1.getNome() + " alugado", administrador.getUltimaNot());
        assertEquals(null, cliente.getUltimaNot());
    }

}