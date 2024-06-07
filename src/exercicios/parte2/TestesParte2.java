package exercicios.parte2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exercicios.parte2.modulos.Livro;
import exercicios.parte2.modulos.Pessoa;

import java.lang.reflect.Modifier;

public class TestesParte2 {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Matheus\",\"idade\":25,\"cidade\":\"SantaIsabel\"}";

        Gson gson = new GsonBuilder()
                .create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);

        String jsonLivro = "{\"titulo\":\"Duna\",\"autor\":\"Frank Herbert\",\"editora\":{\"nome\":\"Aleph\",\"cidade\":\"São Paulo\"}}";
        Gson gson1 = new Gson();
        Livro livro = gson1.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);


    }
}
