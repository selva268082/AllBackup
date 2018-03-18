package com.virtusa.one2many.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.one2many.unidir.entity.SportsMan;
import com.virtusa.one2one.unidir.entity.Voter;


public interface SportsManRepository extends CrudRepository<SportsMan, Integer> {

}
