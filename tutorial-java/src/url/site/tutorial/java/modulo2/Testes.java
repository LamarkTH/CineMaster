package url.site.tutorial.java.modulo2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Testes {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite a moeda que você quer ver a cotação");
        String moeda=scanner.next();
        String url="https://api.coingecko.com/api/v3/simple/price?ids="+moeda+"&vs_currencies=usd&x_cg_demo_api_key=CG-hpMg3gM75gn1jixwEuPc7NpG";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


        System.out.print("Digite a receita que você quer:");
        String receita= scanner.next();
        String url2="https://www.themealdb.com/api/json/v1/1/search.php?s="+receita;
        HttpClient client2 = HttpClient.newHttpClient();
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create(url2))
                .build();
        HttpResponse<String> response2 = client2
                .send(request2, HttpResponse.BodyHandlers.ofString());
        System.out.println(response2.body());
    }
}
