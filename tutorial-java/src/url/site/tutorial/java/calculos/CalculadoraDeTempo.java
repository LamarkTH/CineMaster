package url.site.tutorial.java.calculos;
import url.site.tutorial.java.modulo2.Titulo;

public class
CalculadoraDeTempo {
    private double tempoTotal;

    //Polimorfismo
    public  void calcula(Titulo titulo){
        this.tempoTotal+=titulo.getDuracaoEmMinutos();
    }

    public double getTempoTotal() {
        return tempoTotal;
    }
}
