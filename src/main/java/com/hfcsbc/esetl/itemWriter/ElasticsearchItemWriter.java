package com.hfcsbc.esetl.itemWriter;

import com.hfcsbc.esetl.repository.es.EsPersonRepository;
import com.hfcsbc.esetl.domain.Person;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Create by pengchao on 2018/2/23
 */
public class ElasticsearchItemWriter implements ItemWriter<Person>, ItemWriteListener<Person>, StepExecutionListener {

    private EsPersonRepository personRepository;

    public ElasticsearchItemWriter(EsPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void beforeWrite(List<? extends Person> items) {

    }

    @Override
    public void afterWrite(List<? extends Person> items) {

    }

    @Override
    public void onWriteError(Exception exception, List<? extends Person> items) {

    }

    @Override
    public void beforeStep(StepExecution stepExecution) {

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return null;
    }

    @Override
    public void write(List<? extends Person> items) throws Exception {
        personRepository.saveAll(items);
    }
}
