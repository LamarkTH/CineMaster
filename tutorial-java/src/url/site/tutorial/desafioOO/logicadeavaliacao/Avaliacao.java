package url.site.tutorial.desafioOO.logicadeavaliacao;

public class Avaliacao {
    public String avalia(Classificacao classificacao){
        if(classificacao.classifica()>=4){
            return "Em alta";
        } else if (classificacao.classifica()>=3 &&classificacao.classifica()<4) {
            return "Top 20 mais assistidos";
        } else {
            return "Top 50º+ mais assistido";
        }
    }
}
