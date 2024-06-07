package exercicios.parte1.modulos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Books {
    private String busca;

    public Books(String busca) {
        this.busca = busca;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public String chamaApi() throws IOException, InterruptedException {

        String chave = "AIzaSyCSvUI1GOqEWAsIftd8bysKUOUcJdn-6Ig";
        String endereco = STR."https://www.googleapis.com/books/v1/volumes?q=\{busca}&key=\{chave}";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
