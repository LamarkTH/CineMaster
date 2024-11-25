package url.site.tutorial.desafioOO.compras;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Limite do cartão
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Digite o limite do cartão :");
        double limite= scanner.nextDouble();
        Cartao cartao= new Cartao(limite);

        while(true){
            //Adicionando elementos na lista
            System.out.printf("Digite o item a ser comprado : ");
            String item= scanner.next();
            System.out.printf("Digite o valor da compra: ");
            double valor= scanner.nextDouble();
            Compra compra= new Compra(item, valor);
            cartao.adicionaLista(compra);

            //Logica de finalização da compra
            System.out.printf("Digite 0 para finalizar as compras ou 1 para continuar :");
            int confirmacao= scanner.nextInt();
            if (confirmacao==0) {
                cartao.imprimeLista();
                scanner.close();
                break;
            }
        }
    }
}
