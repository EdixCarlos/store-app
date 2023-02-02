package com.keola.store.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Table("store.sub_rubro")
public class SubRubro implements Persistable<Integer> {
    @Id
    @Column("sub_rubro_id")
    private Integer subRubroId;

    @Column("rubro_id")
    private Integer rubroId;

    @Column("name")
    private String name;

    @Override
    @Transient
    public Integer getId() {
        return subRubroId;
    }

    @Override
    @Transient
    public boolean isNew() {
        return subRubroId == null;
    }
}