package swagger.rest.stef.service.dto;

import swagger.rest.stef.domain.Pessoa;

/**
 * DTO QUE REPRESENTA O ENDERECO
 */
public class EnderecoDTO {

    private Long id;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String estado;

    private Pessoa pessoa;

    public EnderecoDTO() {
        // Empty constructor
    }

    public EnderecoDTO(EnderecoDTO endereco) {
        this.id = endereco.getId();
        this.logradouro = endereco.getLogradouro();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.pessoa = endereco.getPessoa();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro= logradouro;
    }

    public String getBairro() { return bairro; }

    public void setBairro(String bairro) {
        this.bairro = bairro ;
    }

    public String getCidade() { return cidade; }

    public void setCidade(String cidade) { this.cidade = cidade ; }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {  this.pessoa = pessoa; }





    @Override
    public String toString() {
        return "EnderecoDTO{" +
            "logradouro='" + logradouro+ '\'' +
            ", bairro='" + bairro+ '\'' +
            ", cidade='" + cidade + '\'' +
            ", estado='" + estado + '\'' +
            ", pessoa='" + pessoa +
            "}";
    }


}
