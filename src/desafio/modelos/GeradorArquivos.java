package desafio.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivos {
    private String nomeArquivo;
    private String conteudo;

    Gson gson =new GsonBuilder().setPrettyPrinting().create();

    public GeradorArquivos(String nomeArquivo, Endereco conteudo) {
        this.nomeArquivo = nomeArquivo;
        this.conteudo = gson.toJson(conteudo);
    }

    public void geraArquivo(){
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            arquivo.write(conteudo);
            arquivo.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
