package url.site.tutorial.java.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if( classificavel.getClassificacao()>=4){
            System.out.println("Esse filme está entre os top mais recomendados");
        }
        else if( classificavel.getClassificacao()>=2 && classificavel.getClassificacao()<4){
            System.out.println("Esse filme é bem aceito");
        }
        else{
            System.out.println("Esse filme pode ser um bom filme");
        }
    }
}
