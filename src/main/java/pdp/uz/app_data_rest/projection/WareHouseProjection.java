package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.WareHouse;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

@Projection(types = WareHouse.class)
public interface WareHouseProjection extends FlexibleProjection {

}
