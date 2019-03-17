package swagger.rest.stef.repository;

import swagger.rest.stef.domain.Endereco;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import swagger.rest.stef.service.dto.EnderecoDTO;


/**
 * Spring Data  repository for the Endereco entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
