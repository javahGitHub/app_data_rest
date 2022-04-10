package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Product;
import pdp.uz.app_data_rest.projection.ProductProjection;

@RepositoryRestResource(path = "product",excerptProjection = ProductProjection.class)
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
