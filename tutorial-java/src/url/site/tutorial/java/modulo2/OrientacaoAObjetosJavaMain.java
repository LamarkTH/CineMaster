package url.site.tutorial.java.modulo2;
import url.site.tutorial.java.calculos.CalculadoraDeTempo;
import url.site.tutorial.java.calculos.Episodios;
import url.site.tutorial.java.calculos.FiltroRecomendacao;
import java.util.ArrayList;
import java.util.List;

public class OrientacaoAObjetosJavaMain {
    public static void main(String[] args) {
        //Classe filme
        //Classe FiltroRecomendacao que aceita qualquer objeto que tenha o contrato com a interface classificavel
        FiltroRecomendacao filtroFilmeSerie= new FiltroRecomendacao();
        Filme filme1= new Filme("John Wick 3",2025,180,true,"Stiven Sigal");

        filme1.setIncluiNoPlano(true);

        filme1.avalia(8);
        filme1.avalia(6);
        filme1.avalia(7);
        filme1.exibeFichaTecnica();


        System.out.printf("Total de avaliações pelo método acessor get: %d\n",filme1.getTotalDeAvaliacoes());
        //Obs :Ao invocar o método exibeFichaTecnica, antes dos métodos avalia, o resultado impresso pelo
        //exibeFichaTecnica é NaN, mas quando é invocado após os métodos avalia, o resultado sai certo
        //Na classe Main, a ordem das invocações importam caso um método dependa do outro

        //Utilizando o método da Classe FiltroRecomendacao, que aceita todas os objetos que possuem um contrato com a interface Classificavel
        filtroFilmeSerie.filtra(filme1);

        Filme filme2= new Filme("The Batman",2022,240,false,"Diretor dos planeta dos macacos");

        filme2.avalia(9);
        filme2.avalia(9.5);

        filme2.exibeFichaTecnica();
        //Utilizando o método da Classe FiltroRecomendacao, que aceita todas os objetos que possuem um contrato com a interface Classificavel
        filtroFilmeSerie.filtra(filme2);

        Filme filme3= new Filme("Corseu",2003,180,true,"John Stwart");

        filme3.avalia(8.5);

        filme3.exibeFichaTecnica();
        filtroFilmeSerie.filtra(filme3);




        //Testes com a classe Série
        Serie theWalkingDead= new Serie("The Walking Dead",2034,30,true,12,24,false);

        theWalkingDead.avalia(8);
        theWalkingDead.avalia(5);
        theWalkingDead.avalia(9);
        theWalkingDead.exibeFichaTecnica();

        //Utilizando o método da Classe FiltroRecomendacao, que aceita todas os objetos que possuem um contrato com a interface Classificavel
        filtroFilmeSerie.filtra(theWalkingDead);
        CalculadoraDeTempo calculadoraDeTempo= new CalculadoraDeTempo();
        calculadoraDeTempo.calcula(filme1);
        calculadoraDeTempo.calcula(filme2);
        calculadoraDeTempo.calcula(theWalkingDead);//Polimorfismo

        System.out.println(String.format("Esse é o total de tempo para assistir o filme: %.2f",calculadoraDeTempo.getTempoTotal()));

        //Utilizando na pratica o interface

        Episodios episodio1= new Episodios(1,"Desastre",theWalkingDead);
        episodio1.setTotalDeAvaliacoes(100);

        //Utilizando o método da Classe FiltroRecomendacao, que aceita todas os objetos que possuem um contrato com a interface Classificavel
        filtroFilmeSerie.filtra(episodio1);


        //Criando uma lista em java: Array
        List<Filme> colecaoDeFilmes= new ArrayList<>();
        colecaoDeFilmes.add(filme1);
        colecaoDeFilmes.add(filme2);
        colecaoDeFilmes.add(filme3);
        System.out.println(colecaoDeFilmes);

        //Acessando array pela estrutura for
        System.out.println();
        for (int i=0; i<colecaoDeFilmes.size(); i++){
            System.out.println(String.format("Filme : %s",colecaoDeFilmes.get(i).getNome()));
        }

        ArrayList<Serie> serie= new ArrayList<>();
        serie.add(theWalkingDead);
        System.out.println(serie);

    }
}
