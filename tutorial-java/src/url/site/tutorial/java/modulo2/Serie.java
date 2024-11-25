package url.site.tutorial.java.modulo2;

import url.site.tutorial.desafioOO.logicadeavaliacao.Classificacao;
import url.site.tutorial.java.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    //Atributos
    private int totalDeTemporadas;
    private int episodiosPorTemporada;
    private boolean emLancamento;
    private String tipo;

    //Métodos
    public Serie(String nome, int anoDeLancamento, double duracaoEmMinutos, boolean incluiNoPlano) {
        super(nome, anoDeLancamento, duracaoEmMinutos,incluiNoPlano);

    }
    public Serie(String nome, int anoDeLancamento, double duracaoEmMinutos, boolean incluiNoPlano, int totalDeTemporadas, int episodiosPorTemporada, boolean emLancamento) {
        super(nome, anoDeLancamento, duracaoEmMinutos,incluiNoPlano);
        this.totalDeTemporadas = totalDeTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.emLancamento = emLancamento;

    }

    public Serie() {
    }

    public int getTotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public void setTotalDeTemporadas(int totalDeTemporadas) {
        this.totalDeTemporadas = totalDeTemporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public String getEmLancamento() {
        if (emLancamento) {
            return "esta em lançameto";
        } else {
            return "não esta em lançamento";
        }
    }

    public void setEmLancamento(boolean emLancamento) {
        this.emLancamento = emLancamento;
    }

    @Override
    public double getDuracaoEmMinutos() {
        return super.getDuracaoEmMinutos() * episodiosPorTemporada * totalDeTemporadas;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println(getTotalDeTemporadas());
        System.out.println(getEpisodiosPorTemporada());
        System.out.println(getEmLancamento());
    }

    @Override
    public String toString() {
        return """
               Nome do filme: %s
               Nome do diretor: %d
               Ano de lançamento: %s
               """.formatted(this.getNome(),this.getTotalDeTemporadas(),this.getAnoDeLancamento());
    }
    @Override
    public int getClassificacao() {
        return 0;
    }
}

