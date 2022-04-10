package pdp.uz.app_data_rest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AttachmentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private byte[] bytes;

    @OneToOne
    private Attachment attachment;
}
