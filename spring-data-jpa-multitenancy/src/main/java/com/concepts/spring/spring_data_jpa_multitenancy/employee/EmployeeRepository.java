package com.concepts.spring.spring_data_jpa_multitenancy.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository 
        extends CrudRepository<Employee, Integer> {
      
}
