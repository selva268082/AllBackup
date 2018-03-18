package com.virtusa.one2one.repo;

import org.springframework.data.repository.CrudRepository;

import com.virtusa.one2one.bidir.foriegnkey.entity.DeltaEmployee;
 

public interface DeltaEmployeeRepository extends CrudRepository<DeltaEmployee,Integer> {

}
