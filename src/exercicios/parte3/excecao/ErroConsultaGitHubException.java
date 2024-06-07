package exercicios.parte3.excecao;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
