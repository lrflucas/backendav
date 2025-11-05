package med.voll.api.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public record DadosCadastroUsuario(@NotBlank(message = "Login é Obrigatório!!!") String login, @NotBlank(message = "Senha é Obrigatório!!!") String senha) {
}
