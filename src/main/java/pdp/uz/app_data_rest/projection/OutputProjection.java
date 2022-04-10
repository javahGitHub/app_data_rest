package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputProjection {
    int getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Provider getProvider();

    Currency getCurrency();

    String getInvoiceNumber();

    String getCode();

    Client getClient();
}
