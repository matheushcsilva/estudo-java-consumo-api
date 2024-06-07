package desafio.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiViaCep {
    private String cep;

    public ApiViaCep(String cep) {
        this.cep = cep;
    }

    public Endereco buscaCep() throws IOException, InterruptedException {
        URI endereco = URI.create(STR."https://viacep.com.br/ws/\{cep}/json/");
        String json = "";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),Endereco.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException ("Não consegui obter o endereço a partir desse CEP.");
        }

    }
}
