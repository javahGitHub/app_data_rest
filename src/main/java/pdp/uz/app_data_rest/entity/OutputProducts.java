package pdp.uz.app_data_rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class OutputProducts {
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

    @ManyToOne
    private Output output;

}
