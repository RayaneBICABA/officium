package com.pankassi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pankassi.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
}
