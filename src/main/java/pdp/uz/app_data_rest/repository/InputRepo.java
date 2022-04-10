package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Input;
import pdp.uz.app_data_rest.projection.InputProjection;

@RepositoryRestResource(path = "input",excerptProjection = InputProjection.class)
public interface InputRepo extends JpaRepository<Input,Integer> {
}
