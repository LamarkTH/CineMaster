package url.site.tutorial.java.modulo2;

import url.site.tutorial.java.calculos.FiltroRecomendacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        FiltroRecomendacao filtroFilmeSerie= new FiltroRecomendacao();
        Filme filme1= new Filme("John Wick 3",2023,180,true,"Stiven Sigal");
        Filme filme2= new Filme("The Batman",2022,240,false,"Diretor dos planeta dos macacos");
        Serie theWalkingDead= new Serie("The Walking Dead",2014,30,true,12,24,false);
        Filme filme3= new Filme("A car",2022,240,false,"Diretor dos planeta dos macacos");

        //Array
        ArrayList<Titulo> colecaoDeFilmes= new ArrayList<>();
        colecaoDeFilmes.add(filme1);
        colecaoDeFilmes.add(filme2);
        colecaoDeFilmes.add(filme3);

        colecaoDeFilmes.add(theWalkingDead);

        for (Titulo item : colecaoDeFilmes) {
            //System.out.println(item.getNome());
            //Porque instanceof é uma má pratica
            if (item instanceof Filme){
                Filme filme=(Filme) item;
                filme.exibeFichaTecnica();
                System.out.println();
            } else if (item instanceof Serie) {
                Serie serie=(Serie) item;
                serie.exibeFichaTecnica();
                System.out.println();
            }
        }

        //Comparando objetos na lista
        ArrayList<Integer> numeros= new ArrayList<Integer>();
        for(int i=0;i<6;i++){numeros.add(i);}
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        for(Titulo titulos : colecaoDeFilmes){
            System.out.println(titulos.getNome());
        }
        Collections.sort(colecaoDeFilmes);
        System.out.println();
        for(Titulo titulos : colecaoDeFilmes){
            System.out.println(titulos.getNome());
        }
        System.out.println();
        //Método da Interface Comparator, comparing, investigar depois
        colecaoDeFilmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        for(Titulo titulos : colecaoDeFilmes){
            System.out.println(titulos.getAnoDeLancamento());
        }

    }
}
