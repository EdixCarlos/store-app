package com.keola.store.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("store.type")
public class Type implements Persistable<Integer> {
    @Id
    @Column("type_id")
    private Integer typeId;

    @Column("name")
    private String name;

    @Override
    public Integer getId() {
        return typeId;
    }

    @Override
    @Transient
    public boolean isNew() {
        return typeId == null;
    }
}