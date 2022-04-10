package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.Currency;
import pdp.uz.app_data_rest.entity.Input;
import pdp.uz.app_data_rest.entity.Provider;
import pdp.uz.app_data_rest.entity.WareHouse;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {

    int getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Provider getProvider();

    Currency getCurrency();

    String getInvoiceNumber();

    String getCode();


}
