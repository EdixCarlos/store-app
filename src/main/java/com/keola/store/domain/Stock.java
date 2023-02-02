package com.keola.store.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("stock")
public class Stock {
    @Id
    @Column("stock_id")
    private Long stockId;

    @Column("store_id")
    private Long storeId;

    @Column("product_id")
    private Long productId;

    @Column("quantity")
    private Integer quantity;
}