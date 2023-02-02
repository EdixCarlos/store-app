package com.keola.store.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("store.rubro")
public class Rubro implements Persistable<Integer> {
    @Id
    @Column("rubro_id")
    private Integer rubroId;

    @Column("name")
    private String name;

    @Override
    public Integer getId() {
        return rubroId;
    }

    @Override
    @Transient
    public boolean isNew() {
        return rubroId == null;
    }
}