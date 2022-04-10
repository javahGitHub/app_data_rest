package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Attachment;
import pdp.uz.app_data_rest.entity.Category;
import pdp.uz.app_data_rest.entity.Measurement;
import pdp.uz.app_data_rest.entity.Product;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

@Projection(types = Product.class)
public interface ProductProjection extends FlexibleProjection {
     Category getCategory();

     Attachment getPhoto();

     String getCode();

    Measurement getMeasurement();

}
