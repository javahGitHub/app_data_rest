package pdp.uz.app_data_rest.entity;


import lombok.Data;
import pdp.uz.app_data_rest.entity.entity_templete.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Category extends AbsEntity {

    @ManyToOne
    private Category parentCategory;

}
