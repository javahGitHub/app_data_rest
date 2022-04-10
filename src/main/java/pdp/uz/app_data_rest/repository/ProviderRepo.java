package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Provider;
import pdp.uz.app_data_rest.projection.ProviderProjection;

@RepositoryRestResource(path = "provider",excerptProjection = ProviderProjection.class)
public interface ProviderRepo extends JpaRepository<Provider,Integer> {
}
