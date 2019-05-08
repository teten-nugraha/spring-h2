package com.tutorialh2.tutorialh2.repository;

import com.tutorialh2.tutorialh2.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
