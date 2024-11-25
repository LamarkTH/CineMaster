package url.site.tutorial.java.modulo2;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSource {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite o filme: ");
        String filme= scanner.next();
        String chaveApi="cf09d90f";
        String url="https://www.omdbapi.com/?t="+filme+"&type=movie&r=json&apikey="+chaveApi;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        //Transformando arquivos JSON em classes e objetos
        Gson gson= new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Titulo descricaoFilme= gson.fromJson(response.body(), Titulo.class);
        System.out.println(descricaoFilme);

        Titulo descricaoFilme2= new Titulo();
    }
}
