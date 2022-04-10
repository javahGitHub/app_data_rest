package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.*;

import javax.persistence.*;
import java.sql.Date;

@Projection(types = OutputProducts.class)
public interface OutputProductsProjection {
    int getId();

    Product getProduct();

    Measurement getMeasurement();

    double getAmount();

    double getPrice();

     Output getOutput();
}
