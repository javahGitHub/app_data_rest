package pdp.uz.app_data_rest.entity;

import lombok.Data;
import pdp.uz.app_data_rest.entity.entity_templete.AbsEntity;

import javax.persistence.*;

@Data
@Entity
public class Provider extends AbsEntity {



    @Column(nullable = false, unique = true)
    private String phoneNumber;
}
