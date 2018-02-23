package com.hfcsbc.esetl.repository.es;

import com.hfcsbc.esetl.domain.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Create by pengchao on 2018/2/23
 */
public interface EsPersonRepository extends ElasticsearchRepository<Person, Long> {
}
