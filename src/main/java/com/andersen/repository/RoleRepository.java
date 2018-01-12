package com.andersen.repository;


import com.andersen.model.Role;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
}
