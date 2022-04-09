package com.ripple.vmprovisioning.repository;

import com.ripple.vmprovisioning.models.RoleEnum;
import com.ripple.vmprovisioning.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(RoleEnum name);
}
