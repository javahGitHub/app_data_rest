package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Input;
import pdp.uz.app_data_rest.entity.InputProducts;
import pdp.uz.app_data_rest.entity.Measurement;
import pdp.uz.app_data_rest.entity.Product;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Projection(types = InputProducts.class)
public interface InputProductsProjection {
     int getId();

     Product getProduct();

     Measurement getMeasurement();

     double getAmount();

     double getPrice();

     Date getExpireDate();

     Input getInput();
}
