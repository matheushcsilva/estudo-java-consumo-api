package exercicios.parte4.modelos;

import java.io.FileWriter;
import java.io.IOException;

public class GravadorArquivos {
    private String nomeArquivo;
    private String conteudo;

    public GravadorArquivos(String nomeArquivo, String conteudo) {
        this.nomeArquivo = nomeArquivo;
        this.conteudo = conteudo;
    }

    public void gravaArquivo(){
        try {
            FileWriter gravacao = new FileWriter(STR."\{nomeArquivo}");
            gravacao.write(conteudo);
            gravacao.close();
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
