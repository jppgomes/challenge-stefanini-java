package swagger.rest.stef.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import swagger.rest.stef.domain.Endereco;
import swagger.rest.stef.repository.EnderecoRepository;
import swagger.rest.stef.service.dto.EnderecoDTO;


/**
 * Service class for managing endereco.
 */
@Service
@Transactional
public class EnderecoService {

    @Autowired
    private final EnderecoRepository enderecoRepository;


    public EnderecoService(EnderecoRepository enderecoRepository) {

        this.enderecoRepository = enderecoRepository;
    }

    public Endereco criaEndereco(Endereco endereco) {

        EnderecoDTO enderecoDTO;
        enderecoDTO = new EnderecoDTO ();

        enderecoDTO.setCidade((endereco.getCidade()));
        enderecoDTO.setBairro((endereco.getBairro()));
        enderecoDTO.setLogradouro((endereco.getLogradouro()));
        enderecoDTO.setId((endereco.getId()));
        enderecoDTO.setEstado((endereco.getEstado()));
        enderecoDTO.setPessoa((endereco.getPessoa()));

        return enderecoRepository.save(endereco);

    }
}
