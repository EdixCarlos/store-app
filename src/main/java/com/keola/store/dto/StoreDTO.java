package com.keola.store.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class StoreDTO {
    public class StockDTO implements Serializable {
        private Long storeBranchId;
        private Long productId;
        private Integer quantity;

        public Long getStoreBranchId() {
            return storeBranchId;
        }

        public void setStoreBranchId(Long storeBranchId) {
            this.storeBranchId = storeBranchId;
        }

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    }

}
