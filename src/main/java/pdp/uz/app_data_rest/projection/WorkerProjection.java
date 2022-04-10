package pdp.uz.app_data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.app_data_rest.entity.WareHouse;
import pdp.uz.app_data_rest.entity.Worker;

import javax.persistence.*;
import java.util.Set;

@Projection(types = Worker.class)
public interface WorkerProjection {

    int getId();


    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getPosition();

    String getCode();

    String getPassword();

    boolean isActive();

    Set getWareHouse();
}
