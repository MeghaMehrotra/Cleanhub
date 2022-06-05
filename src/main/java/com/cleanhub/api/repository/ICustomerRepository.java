package com.cleanhub.api.repository;

import com.cleanhub.api.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByUuid(String uuid);

    Page<Customer> findAll(Pageable pageable);

}
