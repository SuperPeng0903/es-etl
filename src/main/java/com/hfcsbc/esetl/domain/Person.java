package com.hfcsbc.esetl.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Create by pengchao on 2018/2/23
 */
@Document(indexName = "person", type = "person", shards = 1, replicas = 0, refreshInterval = "-1")
@Entity
@Data
public class Person {
    @Id
    private Long id;
    private String name;
    @OneToOne
    @Field(type = FieldType.Nested)
    private Address address;
}
