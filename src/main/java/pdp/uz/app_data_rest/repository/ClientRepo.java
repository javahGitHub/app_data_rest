package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Client;
import pdp.uz.app_data_rest.projection.ClientProjection;

@RepositoryRestResource(path = "client",excerptProjection = ClientProjection.class )
public interface ClientRepo extends JpaRepository<Client,Integer> {

}
