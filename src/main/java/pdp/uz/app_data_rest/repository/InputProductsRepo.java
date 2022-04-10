package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.InputProducts;
import pdp.uz.app_data_rest.projection.InputProductsProjection;

@RepositoryRestResource(path = "inputProducts",excerptProjection = InputProductsProjection.class )
public interface InputProductsRepo extends JpaRepository<InputProducts,Integer> {
}
