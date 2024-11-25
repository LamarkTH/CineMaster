package url.site.tutorial.java.modulo1;
import java.util.Scanner;

public class DesafiosModulo2Alura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota :");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota :");
        float nota2 = scanner.nextFloat();

        float media=(nota1+nota2)/2;
        int avaliacao = (int)  media/2;
        System.out.println(String.format("Essa é a sua média: %.2f \nEssa é sua avialação: %d",media,avaliacao));
        System.out.print("Digite o preço:");
        double precoOriginal=scanner.nextDouble();
        System.out.print("Digite o desconto:");
        double percentualDeDesconto=scanner.nextDouble();

        double valorComDesconto=precoOriginal - ((precoOriginal*percentualDeDesconto)/100);
        String mensagemDoDesconto= """
                O preço com o desconto de %f é: %f
                """.formatted(percentualDeDesconto,valorComDesconto);
        System.out.println(mensagemDoDesconto);
        scanner.close();
        char letra='S';
        String sim="Sim";
        System.out.println(String.format("%c = %s",letra,sim));
        System.out.println(sim + letra);
    }
}
