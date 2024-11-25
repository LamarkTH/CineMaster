package url.site.tutorial.desafioOO.compras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compra> lista=new ArrayList<>();

    public Cartao(double limite){
        this.limite=limite;
        this.saldo=limite;
    }

    public void adicionaLista(Compra compra){
        if(compra.getValor()<=getSaldo()){
            this.saldo-=compra.getValor();
            lista.add(compra);
            System.out.println("Item comprado: %s".formatted(compra.getDescricao()));
            System.out.println("Saldo restante: R$%.2f".formatted(getSaldo()));
        } else {
            System.out.println("Saldo insuficiente, você precisa de: R$%.2f pra realizar a compra".formatted((compra.getValor()-getSaldo())));
            System.out.println("Esse é o seu saldo restante: %.2f".formatted(getSaldo()));
        }
    }

    public void imprimeLista(){
        Collections.sort(lista);

        System.out.println("Essas são as suas compras feitas\n");
        for(Compra item: lista){
            System.out.print(item+"\n");
        }
        System.out.println("Esse é o seu saldo restante: %.2f".formatted(getSaldo()));
    }

    public double getSaldo() {
        return saldo;
    }
}

