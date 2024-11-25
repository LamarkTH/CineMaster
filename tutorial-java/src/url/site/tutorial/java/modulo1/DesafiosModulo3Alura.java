package url.site.tutorial.java.modulo1;

import java.util.Scanner;

public class DesafiosModulo3Alura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        if (numero1 < 0){
            System.out.println(String.format("%d é menor que 0",numero1));}
        else if (numero2 < 0){
            System.out.println(String.format("%d é menor que 0",numero2));}
        else if (numero1 > 0){
            System.out.println(String.format("%d é maior que 0",numero2));}
        else if (numero2 > 0){
            System.out.println(String.format("%d é maior que 0",numero2));}
        else if (numero1 == numero2){
            System.out.println(String.format("%d é igual a %d",numero2,numero1));}
        System.out.println();
        System.out.println(String.format("%d é igual a %d",numero2,numero1));
        for (int i=1; i < 11; i++){
            System.out.println(String.format("%d X %d ="+numero1*i,numero1,i));
        }
        System.out.println();
        for (int i=1; i < 11; i++){
            System.out.println(String.format("%d X %d ="+numero2*i,numero2,i));
        }
        //Tem como fazer a multiplicação dentro do placeholder
        System.out.println(String.format("Esse é o fatorial do número %d",numero1));
        int acumulador1=1;
        for (int j=numero1; j>0 ; j--) {
            acumulador1*=(j);
            if (j>1){
                System.out.print(String.format("%dX",j));
            }
            else {
                System.out.print(String.format("%d=",j));
            }
        }

        System.out.println(acumulador1);

        int acumulador2=1;
        int k=numero2;
        while (k>0) {
            if (k>1){
                System.out.print(String.format("%dX",k));
            }
            else {
                System.out.print(String.format("%d=",k));
            }
            acumulador2*=k;
            k--;
        }
        System.out.println(acumulador2);

        //Note que todo for pode ser transformando em while, e vise-versa
        scanner.close();
    }

    public static class ProdutoPerecivelExercicio extends ProdutoExercicio {
        private String dataValidade;
        public ProdutoPerecivelExercicio(String nome,double preco,int quantidade,String dataValidade){
            super(nome,preco,quantidade);
            this.dataValidade=dataValidade;

        }
    }

    public static class ProdutoExercicio {
        private  String nome;
        private double preco;
        private int quantidade;

        public ProdutoExercicio(String nome,double preco,int quantidade){
            this.nome=nome;
            this.preco=preco;
            this.quantidade=quantidade;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        @Override
        public String toString() {
            return """
                    Nome: %s"
                    Preço: R$%.2f
                    Quantidade: %d
                    """.formatted(getNome(), getPreco(), getQuantidade());
        }
    }
}
