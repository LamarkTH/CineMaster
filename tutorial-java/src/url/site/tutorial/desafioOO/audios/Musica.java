package url.site.tutorial.desafioOO.audios;
import url.site.tutorial.desafioOO.logicadeavaliacao.Classificacao;

public class Musica extends Audio implements Classificacao {
    private String genero;
    private String Album;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
