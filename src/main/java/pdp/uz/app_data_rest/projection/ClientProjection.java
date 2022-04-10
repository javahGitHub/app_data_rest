package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Client;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

@Projection(types = Client.class)
public interface ClientProjection extends FlexibleProjection {
    String getPhoneNumber();
}
