package url.site.tutorial.java.modulo1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite a primeira nota :");
            float nota1 = scanner.nextFloat();
            System.out.print("Digite a segunda nota :");
            float nota2 = scanner.nextFloat();
            System.out.print("Digite a terceira nota :");
            float nota3 = scanner.nextFloat();
            float media= (nota1 + nota2 + nota3) / 3;
            int estrelaDoAluno= (int) media;
            System.out.println(String.format("A média das notas é : %.2f e o aluno é %", media));
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você não digitou um número inteiro válido.");
        }
        scanner.close();
        System.out.println("Fim do programa ");
        String nome = "João";
        int aulas = 4;
        System.out.println(String.format("""
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """,nome,aulas));
        String texto= """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome,aulas);
        System.out.println(texto);
    }
}
