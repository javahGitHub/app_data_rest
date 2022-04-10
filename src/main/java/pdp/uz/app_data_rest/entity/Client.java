package pdp.uz.app_data_rest.entity;

import lombok.Data;
import pdp.uz.app_data_rest.entity.entity_templete.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Client extends AbsEntity {

    @Column(nullable = false, unique = true)
    private String phoneNumber;
}
