package eleicoes;

public class Candidato {

    private String nome;
    private int idade;
    private String partido;
    private int numeroVotos;

    public Candidato(String nome, int idade, String partido, int numeroVotos) {
        this.nome = nome;
        this.idade = idade;
        this.partido = partido;
        this.numeroVotos = numeroVotos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    @Override
    public String toString() {
        return nome + " " + idade + " anos." +
                " Partido " + partido + ", número de votos - " + numeroVotos;
    }
}
