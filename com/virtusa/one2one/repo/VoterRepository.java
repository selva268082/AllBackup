package com.virtusa.one2one.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.one2one.unidir.entity.Voter;


public interface VoterRepository extends CrudRepository<Voter, Integer> {

}
