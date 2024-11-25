package url.site.tutorial.java.modulo1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class JogoDoNumeroSecreto {
    public static void main(String[] args) {
        int contador=0;
        while (true) {
            Scanner scanner= new Scanner(System.in);
            int numeroAleatorio= new Random().nextInt(10);
            System.out.print("Digite o número que você pensou:");
            int numero= scanner.nextInt();
            if (numero!=numeroAleatorio){
                contador++;
                if (contador==5) {
                    System.out.println("Você perdeu, deseja continuar [S/N]");
                    String mensagemDeContinuar = scanner.next();
                    if (mensagemDeContinuar.equalsIgnoreCase("s")){
                        System.out.println("Novo jogo inicializado");
                        numeroAleatorio= new Random().nextInt(10);
                        contador=0;
                    }
                    else if (mensagemDeContinuar.equalsIgnoreCase("n")) {
                        System.out.println("Fim do programa");
                        break;
                    }
                    else{
                        System.out.println("Digite a letra solicitada");
                    }
                }

                else{
                    if (numero<numeroAleatorio) {
                        System.out.println("O número é maior, digite novamente:");
                    }
                    else if (numero>numeroAleatorio){
                        System.out.println("O número é menor, digite novamente:");
                    }
                }
            }

            else if (numero==numeroAleatorio){
                System.out.println("Você ganhou, deseja continuar [S/N]");
                String mensagemDeContinuar = scanner.next();
                if (mensagemDeContinuar.equalsIgnoreCase("s")){
                    System.out.println("Novo jogo inicializado");
                    numeroAleatorio= new Random().nextInt(10);
                    contador=0;
                }
                else if (mensagemDeContinuar.equalsIgnoreCase("n")) {
                    System.out.println("Fim do programa");
                    break;
                }
                else{
                    System.out.println("Digite a letra solicitada");
                }
            }
        }
    }

    public static class ExibeProdutos {
        private ArrayList<DesafiosModulo3Alura.ProdutoExercicio> listaDeProdutos= new ArrayList<>();



        public void adicionaProdutos(DesafiosModulo3Alura.ProdutoExercicio ProdutoExercicio){
            this.listaDeProdutos.add(ProdutoExercicio);
        }

        public void retornaProdutos(){
            for (DesafiosModulo3Alura.ProdutoExercicio listaDeProduto : listaDeProdutos) {
                System.out.println(listaDeProduto);
            }
        }
    }

    public static class Conta implements  Comparable <Conta> {
        private int numero;
        private String titular;

        public Conta(int numero, String titular){
            this.numero=numero;
            this.titular=titular;
        }

        public int getNumero() {
            return numero;
        }

        public String getTitular() {
            return titular;
        }

        @Override
        public int compareTo(Conta outroNumeroDaLista) {
            if(this.numero< outroNumeroDaLista.getNumero()){
                return -1;
            }
            if(this.numero> outroNumeroDaLista.getNumero()){
                return 1;
            }
            else{
                return 0;
            }
        }

    //    @Override
    //    public int compareTo(Conta conta){
    //        return this.getTitular().compareTo(conta.getTitular());
    //    }
    }
}
