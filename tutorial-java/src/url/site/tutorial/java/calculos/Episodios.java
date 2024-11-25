package url.site.tutorial.java.calculos;

import url.site.tutorial.java.modulo2.Serie;

public class Episodios implements Classificavel {
    private int episodio;
    private String nome;
    private Serie serie;
    private int totalDeAvaliacoes;

    public Episodios(int episodio,String nome,Serie serie){
        this.episodio=episodio;
        this.nome=nome;
        this.serie=serie;
    }
    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie.getNome();
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalDeAvaliacoes>100) {
            return 4;
        }else {
            return 2;
        }
    }
}
