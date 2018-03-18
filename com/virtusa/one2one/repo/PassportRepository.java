package com.virtusa.one2one.repo;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.one2one.unidir.entity.Person;

public interface PassportRepository extends CrudRepository<Person,Integer> {

}
