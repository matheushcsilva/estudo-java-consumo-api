package desafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import desafio.modelos.ApiViaCep;
import desafio.modelos.Endereco;
import desafio.modelos.GeradorArquivos;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cep que deseja buscar: ");
        String cep = scanner.nextLine();

        ApiViaCep apicep = new ApiViaCep(cep);

        try {
            Endereco endereco = apicep.buscaCep();
            GeradorArquivos arquivo = new GeradorArquivos(STR."\{cep}.json", endereco);
            arquivo.geraArquivo();

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizar aplicação");
        }


    }
}
