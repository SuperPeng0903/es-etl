package com.hfcsbc.esetl.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create by pengchao on 2018/2/23
 */
@Entity
@Data
public class Address {
    @Id
    private Long id;
    private String name;
}
