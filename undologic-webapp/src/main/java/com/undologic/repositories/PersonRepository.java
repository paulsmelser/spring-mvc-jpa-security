package com.undologic.repositories;

import com.undologic.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by psmelser on 26/05/15.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(value = "select p from Person p where LOWER(p.firstName) = LOWER(:firstName)")
    Person getByName(@Param("firstName") String firstName);
}
