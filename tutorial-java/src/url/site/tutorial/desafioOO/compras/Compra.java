package url.site.tutorial.desafioOO.compras;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private   double valor;


    public Compra(String descricao,double valor){
        this.descricao=descricao;
        this.valor=valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra compra) {
       return (Double.valueOf(this.getValor()).compareTo(Double.valueOf(compra.getValor())))*-1;
    }

    @Override
    public String toString() {
        return """
                Item:%s---valor:R$%.2f
                """.formatted(getDescricao(),getValor());
    }
}
