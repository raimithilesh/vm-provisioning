package com.ripple.vmprovisioning.repository;

import com.ripple.vmprovisioning.models.VMDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VMRepository extends JpaRepository<VMDetails, Long> {
   
}
