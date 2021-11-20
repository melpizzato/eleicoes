package eleicoes;

import org.junit.Assert;
import org.junit.Test;

public class PrincipalTest {

    @Test
    public void retornaCandidatoMaisNovo(){
        Candidato c1 = new Candidato("Sérgio", 45, "Verde", 400);
        Candidato c2 = new Candidato("Laís", 32, "PDT", 400);
        Principal p = new Principal();

        p.adicionaCandidato(c1);
        p.adicionaCandidato(c2);

        Assert.assertEquals("Laís", p.candidatoMaisNovo().getNome());

    }

    @Test
    public void retornaCandidatoMaisVelho(){
        Candidato c1 = new Candidato("Sérgio", 45, "Verde", 400);
        Candidato c2 = new Candidato("Laís", 32, "PDT", 400);
        Candidato c3 = new Candidato("Maria", 56, "PSDB", 400);
        Principal p = new Principal();

        p.adicionaCandidato(c1);
        p.adicionaCandidato(c2);
        p.adicionaCandidato(c3);

        Assert.assertEquals("Maria", p.candidatoMaisVelho().getNome());

    }

    @Test
    public void retornaCandidatoMaisVotado(){
        Candidato c1 = new Candidato("Sérgio", 45, "Verde", 500);
        Candidato c2 = new Candidato("Laís", 32, "PDT", 400);
        Principal p = new Principal();

        p.adicionaCandidato(c1);
        p.adicionaCandidato(c2);

        Assert.assertEquals("Sérgio", p.candidatoMaisVotado().getNome());

    }

    @Test
    public void retornaCandidatoMenosVotado(){
        Candidato c1 = new Candidato("Sérgio", 45, "Verde", 400);
        Candidato c2 = new Candidato("Laís", 32, "PDT", 400);
        Candidato c3 = new Candidato("Igor", 40, "Rede", 300);
        Principal p = new Principal();

        p.adicionaCandidato(c1);
        p.adicionaCandidato(c2);
        p.adicionaCandidato(c3);

        Assert.assertEquals("Igor", p.candidatoMenosVotado().getNome());

    }

    @Test
    public void retornaTotalVotos(){
        Candidato c1 = new Candidato("Sérgio", 45, "Verde", 400);
        Candidato c2 = new Candidato("Laís", 32, "PDT", 400);
        Candidato c3 = new Candidato("Igor", 40, "Rede", 300);
        Principal p = new Principal();

        p.adicionaCandidato(c1);
        p.adicionaCandidato(c2);
        p.adicionaCandidato(c3);

        Assert.assertEquals(1100, p.totalVotos());
    }

    @Test
    public void retornaMediaDeVotos(){
        Candidato c1 = new Candidato("Sérgio", 45, "Verde", 400);
        Candidato c2 = new Candidato("Laís", 32, "PDT", 400);
        Candidato c3 = new Candidato("Maria", 56, "PSDB", 400);
        Principal p = new Principal();

        p.adicionaCandidato(c1);
        p.adicionaCandidato(c2);
        p.adicionaCandidato(c3);

        Assert.assertEquals(400, p.mediaVotos());
    }
}
