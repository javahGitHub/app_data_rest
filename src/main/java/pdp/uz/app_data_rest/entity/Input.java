package pdp.uz.app_data_rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
@Data
public class Input {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp date;

    @ManyToOne(cascade = {CascadeType.ALL})
    private WareHouse wareHouse;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Provider provider;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Currency currency;

    @Column(nullable = false, unique = true)
    private String invoiceNumber;

    @Column(nullable = false, unique = true)
    private String code;

}
