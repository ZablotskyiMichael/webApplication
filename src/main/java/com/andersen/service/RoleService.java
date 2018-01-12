package com.andersen.service;


import com.andersen.model.Role;
import com.andersen.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {


    @Autowired
    private RoleRepository roleRepository;

    public Iterable<Role> findAllRole() {
        return roleRepository.findAll();
    }

    public void deleteById(long id){
        roleRepository.delete(id);
    }
    public Role getById (long id){
        return roleRepository.findOne(id);
    }
    public void put ( Role role){

        roleRepository.save(role);
    }
    public void create ( Role role){

        roleRepository.save(role);
    }
}
