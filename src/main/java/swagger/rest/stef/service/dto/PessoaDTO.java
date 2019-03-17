package swagger.rest.stef.service.dto;

import swagger.rest.stef.config.Constants;
import swagger.rest.stef.domain.Authority;
import swagger.rest.stef.domain.Endereco;
import swagger.rest.stef.domain.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * DTO QUE REPRESENTA O ENDERECO
 */
public class PessoaDTO {

    private Long id;

    private String nome;

    private String sobrenome;

    private String cpf;

    private String email;

    private EnderecoDTO enderecoDTO;



    public PessoaDTO(PessoaDTO pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
        this.cpf = pessoa.getCpf();
        this.email = pessoa.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome= nome;
    }

    public String getSobrenome() { return sobrenome; }

    public void setSobrenome(String sobrenome) {
        this.sobrenome= sobrenome;
    }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf= cpf; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "PessoaDTO{" +
            "nome='" + nome+ '\'' +
            ", sobrenome='" + sobrenome+ '\'' +
            ", cpf='" + cpf+ '\'' +
            ", email='" + email+ '\'' +

            "}";
    }
}
