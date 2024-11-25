package url.site.tutorial.java.modulo2;

import com.google.gson.annotations.SerializedName;
import url.site.tutorial.java.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //@SerializedName("Director")
    private String diretor;

    public Filme(String nome, int anoDeLancamento, double duracaoEmMinutos, boolean incluiNoPlano,String diretor){
        super(nome,  anoDeLancamento,  duracaoEmMinutos,  incluiNoPlano);
        this.diretor=diretor;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getRetornaAMedia()/2;
    }
    //Método de implementação

    //Reescrevendo métodos da super classe Object, pertencente a bliblioteca java.lang
    @Override
    public String toString() {
        return """
               Nome do filme: %s
               Nome do diretor: %s
               Ano de lançamento: %s
               """.formatted(this.getNome(),this.getDiretor(),this.getAnoDeLancamento());
    }
}

