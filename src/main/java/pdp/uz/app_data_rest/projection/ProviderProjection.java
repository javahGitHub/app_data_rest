package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Provider;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

@Projection(types = Provider.class)
public interface ProviderProjection extends FlexibleProjection {

    String getPhoneNumber();

}
