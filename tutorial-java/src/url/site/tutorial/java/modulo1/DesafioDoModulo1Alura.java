package url.site.tutorial.java.modulo1;
import java.util.Scanner;

public class DesafioDoModulo1Alura {
    public static void main(String[] args) {

        String tipoDaConta="Corrente";
        String nome="Thiago L F da Silva";
        double saldo=1120;
        String mensagemInicial= """
                -------------------------------------
                Dados do Cliente
                
                Nome: %s
                ipo de conta: %s
                Saldo: %.2f
                
                Operações:
                1-Consultar Saldo
                2-Depositar valor
                3-Transferir valor
                4-Encerrar programa
                
                -------------------------------------
                """.formatted(tipoDaConta,nome,saldo);
        System.out.println(mensagemInicial);

        while (true){
            System.out.println("Digite a opcção desejada:");
            Scanner scanner= new Scanner(System.in);
            int entrada= scanner.nextInt();
            if (entrada==1){
                System.out.println(String.format("Esse é o seu saldo R$:%.2f",saldo));
                System.out.println("Digite outro comando");
            }
            else if (entrada == 2) {
                System.out.print("Digite o valor a ser depositado:");
                double valorDepositado = scanner.nextDouble();
                saldo+=valorDepositado;
                System.out.println(String.format("Esse é o seu novo saldo após o deposito R$:%.2f",saldo));
                System.out.println("Digite outro comando");
            }

            else if (entrada == 3) {
                System.out.print("Digite o valor a ser transferido:");
                double valorTransferido= scanner.nextDouble();
                if (valorTransferido>saldo){
                    System.out.println("Você não possui saldo o suficiente para fazer essa transferencia");
                    System.out.println("Digite outro comando");
                }
                else{
                    saldo-=valorTransferido;
                    System.out.println(String.format("Esse é o seu novo saldo após a transferencia R$:%.2f",saldo));
                    System.out.println("Digite outro comando");
                }
            }

            else if (entrada == 4) {
                System.out.println("Programa encerrado.");
                scanner.close();
                break;
            }
            else{
                System.out.println("Entrada de operação incorreta, digite o número solicitado :");
            }
        }
    }
}
