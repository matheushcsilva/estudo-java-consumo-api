package exercicios.parte3;

import exercicios.parte3.excecao.SenhaInvalidaException;
import exercicios.parte3.modelos.ApiGitHub;
import exercicios.parte3.modelos.Divisao;
import exercicios.parte3.modelos.Senhas;

import java.util.Scanner;

public class TestesParte3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = scanner.nextInt();
        System.out.println("Informe o denomindaor: ");
        int denomindaor = scanner.nextInt();
        Divisao divisao = new Divisao(numerador,denomindaor);
        divisao.divide();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        Senhas novaSenha = new Senhas(senha);

        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = scanner.nextLine();
        ApiGitHub apiGitHub = new ApiGitHub(username);
        apiGitHub.consomeApi();
    }
}
