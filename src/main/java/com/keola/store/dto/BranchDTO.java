package com.keola.store.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BranchDTO implements Serializable {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private Double latitude;
    private Double longitude;

    // Getters and setters
}