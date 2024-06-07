package exercicios.parte4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exercicios.parte4.modelos.GravadorArquivos;
import exercicios.parte4.modelos.Titulo;
import exercicios.parte4.modelos.Veiculo;

import java.util.Scanner;

public class TestesParte4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        System.out.print("Digite a mensagem que deseja salvar: ");
        String mensagem = scanner.nextLine();
        System.out.print("Digite o nome do aquivo a ser gerado: ");
        String nomeArquivo = scanner.nextLine();

        GravadorArquivos gravacao = new GravadorArquivos(nomeArquivo,mensagem);
        gravacao.gravaArquivo();

        System.out.print("Digite o nome do título: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o ano de lançamento do título: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o genero do título: ");
        String genero = scanner.next();

        Titulo titulo = new Titulo(nome,ano,genero);

        String jsonTitulo = gson.toJson(titulo);

        System.out.println(jsonTitulo);

        System.out.print("Digite a marca do veiculo: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do Veiculo: ");
        String modelo = scanner.next();
        System.out.print("Digite o ano do veiculo: ");
        int anoFab = scanner.nextInt();


        Veiculo carro = new Veiculo(marca,modelo,anoFab);
        String jsonVeiculo = gson.toJson(carro);

        System.out.println(jsonTitulo);
        System.out.println(jsonVeiculo);

    }
}
