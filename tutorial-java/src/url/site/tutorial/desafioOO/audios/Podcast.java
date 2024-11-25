package url.site.tutorial.desafioOO.audios;

import url.site.tutorial.desafioOO.logicadeavaliacao.Classificacao;

public class Podcast extends Audio implements Classificacao {
    private String convidados;
    private String descricao;
    private String apresentador;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    private String comentario;

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }

    @Override
    public String getDescricao() {
        return """
                Categoria: %s
                Convidados: %s
                Nome da música: %s
                Reprodução da música: %b
                Duração da música: %.2f
                Total de reproduções: %d
                Total de curtidas: %d
                Comentarios: %s
                """.formatted(getCategoria(),getConvidados(),getTitulo(),getReproduzir(),getDuracao(),getTotalDeReproducoes(),getCurtir(),getComentario());
    }

    @Override
    public int classifica() {
        if(getCurtir()>=getTotalDeReproducoes()*0.7){
            return 5;
        }
        else if(getCurtir()>=getTotalDeReproducoes()*0.5){
            return 4;
        }
        else if(getCurtir()>=getTotalDeReproducoes()*0.3){
            return 3;
        }
        else{
            return 2;
        }


    }
}
