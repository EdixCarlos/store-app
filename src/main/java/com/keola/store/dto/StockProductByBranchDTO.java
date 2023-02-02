package com.keola.store.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StockProductByBranchDTO implements Serializable {
    private Integer branchId;
    private Integer productId;
    private Integer stock;
}