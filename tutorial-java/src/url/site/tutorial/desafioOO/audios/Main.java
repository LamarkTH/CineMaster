package url.site.tutorial.desafioOO.audios;

import url.site.tutorial.desafioOO.logicadeavaliacao.Avaliacao;

public class Main {
    public static void main(String[] args) {
        //Objeto Musica
        Musica musica=new Musica();
        musica.setTitulo("In the and");
        musica.setAlbum("Hibrid Theory");

        musica.setReproduzir(true);
        musica.setReproduzir(true);
        musica.setCurtir(true);
        musica.setDuracao(2.50);
        musica.setCurtir(true);
        musica.setCategoria("Música");
        System.out.println(musica.getDescricao());


        //Objeto Audio
        Podcast podcast= new Podcast();
        podcast.setCategoria("Podcast");
        podcast.setTitulo("Podcast´s");
        podcast.setConvidados("Thales Lamark e Antoni Kieds");
        podcast.setDuracao(60);
        podcast.setReproduzir(true);
        podcast.setCurtir(true);
        podcast.setComentario("Otimo podcast");
        System.out.println(podcast.getDescricao());

        Avaliacao avaliacao= new Avaliacao();
        System.out.println(avaliacao.avalia(musica));
        System.out.println(avaliacao.avalia(podcast));
    }
}
