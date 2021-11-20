package eleicoes;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    List<Candidato> candidatos;

    public Principal(){
        this.candidatos = new ArrayList<>();
    }

    public void adicionaCandidato(Candidato c){
        this.candidatos.add(c);
    }

    public Candidato candidatoMaisNovo(){
        Candidato candidatoMaisNovo = null;

        for(int i = 0; i < this.candidatos.size(); i++){
            if( i+1 < this.candidatos.size() &&
                    this.candidatos.get(i).getIdade() < this.candidatos.get(i+1).getIdade()){
                candidatoMaisNovo = this.candidatos.get(i);
            }
            else if (i+1 < this.candidatos.size()){
                candidatoMaisNovo = this.candidatos.get(i+1);
            }
        }
        return candidatoMaisNovo;
    }

    public Candidato candidatoMaisVelho(){
        Candidato candidatoMaisVelho = null;

        for(int i = 0; i < this.candidatos.size(); i++){
            if( i+1 < this.candidatos.size() &&
                    this.candidatos.get(i).getIdade() > this.candidatos.get(i+1).getIdade()){
                candidatoMaisVelho = this.candidatos.get(i);
            }
            else if (i+1 < this.candidatos.size()){
                candidatoMaisVelho = this.candidatos.get(i+1);
            }
        }
        return candidatoMaisVelho;
    }

    public Candidato candidatoMaisVotado(){
        Candidato candidatoMaisVotado = null;

        for(int i = 0; i < this.candidatos.size(); i++){
            if( i+1 < this.candidatos.size() &&
                    this.candidatos.get(i).getNumeroVotos() > this.candidatos.get(i+1).getNumeroVotos()){
                candidatoMaisVotado = this.candidatos.get(i);
            }
            else if (i+1 < this.candidatos.size()){
                candidatoMaisVotado = this.candidatos.get(i+1);
            }
        }
        return candidatoMaisVotado;
    }

    public Candidato candidatoMenosVotado(){
        Candidato candidatoMenosVotado = null;

        for(int i = 0; i < this.candidatos.size(); i++){
            if( i+1 < this.candidatos.size() &&
                    this.candidatos.get(i).getNumeroVotos() < this.candidatos.get(i+1).getNumeroVotos()){
                candidatoMenosVotado = this.candidatos.get(i);
            }
            else if (i+1 < this.candidatos.size()) {
                candidatoMenosVotado = this.candidatos.get(i + 1);
            }
        }
        return candidatoMenosVotado;
    }

    public int totalVotos(){
        int total = 0;

        for(int i = 0; i < this.candidatos.size(); i++){
            total+= this.candidatos.get(i).getNumeroVotos();
        }

        return total;
    }

    public int mediaVotos(){
        int media = totalVotos()/this.candidatos.size();

        return media;
    }
}
