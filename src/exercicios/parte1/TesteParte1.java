package exercicios.parte1;

import exercicios.parte1.modulos.Books;
import exercicios.parte1.modulos.CoinGecko;
import exercicios.parte1.modulos.TheMeal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class TesteParte1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

//        System.out.println("Digite o livro para busca");
//        String busca = leitura.nextLine();
//        busca = busca.replaceAll(" ","+");
//        Books books = new Books(busca);
//        String livro = books.chamaApi();
//        System.out.println(livro);

//        System.out.println("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin): ");
//        String criptoNome = leitura.nextLine();
//        CoinGecko coin = new CoinGecko(criptoNome);
//        String crypto = coin.chamaApi();
//        System.out.println(crypto);

        System.out.println("Digite o nome da receita para a busca: ");
        String nomeReceita = leitura.nextLine();
        nomeReceita = nomeReceita.replaceAll(" ","+");
        TheMeal receita = new TheMeal(nomeReceita);
        String receitaJantar = receita.chamaApi();

        System.out.println(receitaJantar);


    }
}
