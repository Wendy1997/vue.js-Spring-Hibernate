package com.gdn.future.futureprogramwendy.repositories;

import com.gdn.future.futureprogramwendy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
