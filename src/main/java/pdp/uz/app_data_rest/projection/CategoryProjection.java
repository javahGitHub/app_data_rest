package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Category;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

import javax.persistence.ManyToOne;

@Projection(types = Category.class)
public interface CategoryProjection extends FlexibleProjection {

     Category getParentCategory();

}
