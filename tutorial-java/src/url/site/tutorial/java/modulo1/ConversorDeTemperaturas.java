package url.site.tutorial.java.modulo1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ConversorDeTemperaturas {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner= new Scanner(System.in);
            String mensagemDeInstrucao ="""
                Digite c, caso queira converter a temperatura para celsius.
                Digite f, caso queira converter a temperatura para farenheint.
                """;
            System.out.println(mensagemDeInstrucao);

            String temperaturaEspecificada = scanner.next().toLowerCase();


            try{
                System.out.println("Digite a temperatura.");
                double temperatura= scanner.nextDouble();
                if (temperaturaEspecificada.equals("c")) {
                  temperatura=(temperatura - 32) * 5 / 9;
                  System.out.println(String.format("Essa é a temperatura em graus celsius: %.2f",temperatura));
                }
                else if (temperaturaEspecificada.equals("f")) {
                  temperatura=(temperatura * 9 / 5) + 32;
                  System.out.println(String.format("Essa é a temperatura em fereinheint: %.2f",temperatura));
                }
            }

            catch (InputMismatchException variavelException){
                System.out.println("Digite corretamente o que foi pedido");
                scanner.next();//Limpa a entrada do escaner
            }

            System.out.println("Quer continuar o programa /");
            System.out.println("""
                    Digite n, caso queira para o programa.
                    Digite quais quer outras letras, caso queira manter o programa rodando :.
                    """);
            String breaker = scanner.next().toLowerCase();
            if (breaker.equals("n")){
                scanner.close();
                break;
            }
        }
    }
}
