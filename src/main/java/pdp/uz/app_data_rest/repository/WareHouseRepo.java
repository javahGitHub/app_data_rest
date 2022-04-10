package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.WareHouse;
import pdp.uz.app_data_rest.projection.WareHouseProjection;


@RepositoryRestResource(path = "warehouse",excerptProjection = WareHouseProjection.class)
public interface WareHouseRepo extends JpaRepository<WareHouse,Integer> {

}
