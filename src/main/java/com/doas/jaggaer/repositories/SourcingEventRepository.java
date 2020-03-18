package com.doas.jaggaer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.doas.jaggaer.entities.SourcingEvent;

@Repository
public interface SourcingEventRepository extends CrudRepository<SourcingEvent, Long> {

}
