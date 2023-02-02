package com.keola.store.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.yaml.snakeyaml.events.Event;

import java.sql.Timestamp;

@Data
@Table("store.store")
public class Store implements Persistable<Integer>{
    @Id
    @Column("store_id")
    private Integer storeId;

    @Column("store_name")
    private String storeName;

    @Column("email")
    private String email;

    @Column("phone")
    private String phone;

    @Column("type_id")
    private Integer typeId;

    @Column("rubro_id")
    private Integer rubroId;

    @Column("sub_rubro_id")
    private Integer subRubroId;

    @Column("lt")
    private Double lt;

    @Column("lg")
    private Double lg;

    @Column("razon_social")
    private String razonSocial;

    @Column("ruc")
    private String ruc;

    @Column("local_phone")
    private String localPhone;

    @Column("billing_email")
    private String billingEmail;

    @Column("billing_address")
    private String billingAddress;

    @Column("observations")
    private String observations;

    @Column("promoter")
    private String promoter;

    @Column("registration_date")
    private Timestamp registrationDate;

    @Column("state")
    private Boolean state;

    @Column("holder")
    private String holder;

    @Override
    @Transient
    public Integer getId() {
        return storeId;
    }

    @Override
    @Transient
    public boolean isNew() {
        return storeId == null;
    }
}