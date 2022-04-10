package pdp.uz.app_data_rest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Category;
import pdp.uz.app_data_rest.projection.CategoryProjection;

@RepositoryRestResource(path = "category",excerptProjection = CategoryProjection.class)
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
