package med.voll.api.domain.usuario;

public record DadosAutenticacao(String login, String senha) {
    @Override
    public String login() {
        return login;
    }

    @Override
    public String senha() {
        return senha;
    }
}
