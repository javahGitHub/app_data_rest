package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Measurement;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

@Projection(types = Measurement.class)
public interface MeasurementProjection extends FlexibleProjection {

}
