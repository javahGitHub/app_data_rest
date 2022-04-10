package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Output;
import pdp.uz.app_data_rest.projection.OutputProjection;

@RepositoryRestResource(path = "output",excerptProjection = OutputProjection.class)
public interface OutputRepo extends JpaRepository<Output,Integer> {
}
