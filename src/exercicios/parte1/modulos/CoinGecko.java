package exercicios.parte1.modulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinGecko {
    private String nome;

    public CoinGecko(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String chamaApi() throws IOException, InterruptedException {

        String endereco = STR."https://api.coingecko.com/api/v3/simple/price?ids=\{nome}&vs_currencies=usd";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
