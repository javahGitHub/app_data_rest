package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.OutputProducts;
import pdp.uz.app_data_rest.projection.OutputProductsProjection;

@RepositoryRestResource(path = "outProducts",excerptProjection = OutputProductsProjection.class)
public interface OutputProductsRepo extends JpaRepository<OutputProducts,Integer> {

}
