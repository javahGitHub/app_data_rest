package pdp.uz.app_data_rest.entity;

import lombok.Data;
import pdp.uz.app_data_rest.entity.entity_templete.AbsEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
public class Product extends AbsEntity {
    @ManyToOne(optional = false)
    private Category category;

    @OneToOne(cascade = {CascadeType.ALL})
    private Attachment photo;

    private String code;

    @ManyToOne(optional = false)
    private Measurement measurement;

}
