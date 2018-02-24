package com.hfcsbc.esetl.itemReader;

import org.springframework.batch.item.data.AbstractPaginatedDataItemReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import java.util.Iterator;

/**
 * Create by pengchao on 2018/2/24
 */
public class ElasticsearchItemReader<Person> extends AbstractPaginatedDataItemReader<Person> implements InitializingBean {

    private final ElasticsearchOperations elasticsearchOperations;

    private final SearchQuery query;

    private final Class<? extends Person> targetType;

    public ElasticsearchItemReader(ElasticsearchOperations elasticsearchOperations, SearchQuery query, Class<? extends Person> targetType) {
        this.elasticsearchOperations = elasticsearchOperations;
        this.query = query;
        this.targetType = targetType;
    }

    @Override
    protected Iterator<Person> doPageRead() {
        return (Iterator<Person>)elasticsearchOperations.queryForList(query, targetType).iterator();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
