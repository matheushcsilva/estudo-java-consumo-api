package exercicios.parte1.modulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TheMeal {
    private String nome;

    public TheMeal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String chamaApi() throws IOException, InterruptedException {

        String endereco = STR."https://www.themealdb.com/api/json/v1/1/search.php?s=\{nome}";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
