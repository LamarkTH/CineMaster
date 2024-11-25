package url.site.tutorial.desafioOO.audios;

import org.w3c.dom.ls.LSOutput;

public class Audio {
    private String categoria;
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtir;
    private boolean reproduzir;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

   // public void TotalDeReproducoes() {
     //    if(getReproduzir()){
       //      this.totalDeReproducoes++;
    //     }
    //}

    public int getCurtir() {
        return curtir;
    }

    public void setCurtir(boolean curtir) {
        if(curtir){
            this.curtir++;
        }
    }

    public boolean getReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        if(reproduzir){
            totalDeReproducoes++;
        }
    }

    public String getDescricao() {
        return  """
                Categoria: %s
                Nome da música: %s
                Reprodução da música: %b
                Duração da música: %.2f
                Total de reproduções: %d
                Total de curtidas: %d
                """.formatted(getCategoria(),getTitulo(),getReproduzir(),getDuracao(),getTotalDeReproducoes(),getCurtir());
    }
}


