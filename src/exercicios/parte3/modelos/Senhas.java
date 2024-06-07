package exercicios.parte3.modelos;

import exercicios.parte3.excecao.SenhaInvalidaException;

public class Senhas {
    private String senha;

    public Senhas(String senha) {
        try {
            validaSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
            this.senha = senha;
        } catch (SenhaInvalidaException e) {
            System.out.println(STR."Erro: \{e.getMessage()}");
        }
    }

    private static void validaSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
