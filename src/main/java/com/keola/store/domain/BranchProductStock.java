package com.keola.store.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Table("store.branch_product_stock")
public class BranchProductStock {
    @Id
    private Long id;

    @Column("branch_id")
    private Long branchId;

    @Column("product_id")
    private Long productId;

    @Column("stock")
    private Integer stock;


}