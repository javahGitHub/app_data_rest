package pdp.uz.app_data_rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp date;

    @ManyToOne(cascade = {CascadeType.ALL})
    private WareHouse wareHouse;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Currency currency;

    @Column(nullable = false, unique = true)
    private String invoiceNumber;

    @Column(nullable = false, unique = true)
    private String code;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Client client;
}

