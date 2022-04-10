package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Currency;
import pdp.uz.app_data_rest.projection.projection_templete.FlexibleProjection;

@Projection(types = Currency.class)
public interface CurrencyProjection extends FlexibleProjection {
}
