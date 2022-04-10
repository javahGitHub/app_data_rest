package pdp.uz.app_data_rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
public class InputProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Product product;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Measurement measurement;

    @Column(nullable = false, unique = true)
    private double amount;

    @Column(nullable = false, unique = true)
    private double price;

    private Date expireDate;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Input input;

}

